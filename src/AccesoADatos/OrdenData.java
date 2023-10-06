package AccesoADatos;

import Principal.Conexion;
import Principal.Orden;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OrdenData {

    private Connection con = null;

    public OrdenData() {
        con = Conexion.getConexion();
    }

    public List<Orden> listarOrdenes() {
        List<Orden> ordenes = new ArrayList();
        String sql = "SELECT * FROM orden";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaDePago(rs.getString("formaDePago"));
                orden.setImporte(rs.getDouble("importe"));
                orden.setDNIafiliado(rs.getInt("DNIafiliado"));
                orden.setDNIprestador(rs.getInt("DNIprestador"));
                ordenes.add(orden);
            }
            ps.close();
            System.out.println("Activo(s)" + "\n" + ordenes);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }

    public void añadirOrden(Orden orden) {
        String sql = "INSERT INTO orden(DNIafiliado, DNIprestador, fecha, formaDePago, importe`)"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, orden.getDNIafiliado());
            ps.setInt(2, orden.getDNIprestador());
            ps.setDate(3, Date.valueOf(orden.getFecha()));
            ps.setString(4, orden.getFormaDePago());
            ps.setDouble(5, orden.getImporte());
            ps.executeUpdate();
            System.out.println("* * * Método ejecutado correctamente. * * *");
            listarOrdenes();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                orden.setIdOrden(rs.getInt("idOrden"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }
    }

    public void modificarOrden(Orden orden) {
        String sql = "UPDATE  orden SET DNIafiliado=?,"
                + "DNIprestador=?,fecha=?,formaDePago=?,importe=? WHERE DNIafiliado = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, orden.getDNIafiliado());
            ps.setInt(2, orden.getDNIprestador());
            ps.setDate(3, Date.valueOf(orden.getFecha()));
            ps.setString(4, orden.getFormaDePago());
            ps.setDouble(5, orden.getImporte());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("* * * Método ejecutado correctamente. * * *");
                listarOrdenes();
            } else {
                System.out.println("* * * Método ejecutado incorrectamente. * * *");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }

    }

    public void eliminarOrden(int DNIafiliado, Date fecha) {
        String sql = "DELETE FROM orden WHERE DNIafiliado = ? AND fecha = '?'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, DNIafiliado);
            ps.setDate(2, fecha);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                System.out.println("Se eliminó la orden.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }
    }

    public List<Orden> ListaOrdenesPorAfiliado(int dni) {
        List<Orden> ordenes = new ArrayList();
        String sql = "SELECT orden.fecha, orden.formaDePago, orden.importe, orden.idOrden, orden.DNIafiliado, orden.DNIprestador FROM orden WHERE orden.DNIafiliado IN(SELECT afiliado.DNIafiliado FROM afiliado WHERE afiliado.DNIafiliado = ? AND afiliado.estado = 1);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaDePago(rs.getString("formaDePago"));
                orden.setImporte(rs.getInt("importe"));
                orden.setDNIafiliado(rs.getInt("DNIafiliado"));
                orden.setDNIprestador(rs.getInt("DNIprestador"));
                ordenes.add(orden);
            }
            ps.close();
            System.out.println("OrdenesAf" + "\n" + ordenes);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }

    public List<Orden> ListaOrdenesPorPrestador(int dni) {
        List<Orden> ordenes = new ArrayList();
        String sql = "SELECT orden.fecha, orden.formaDePago, orden.importe, orden.idOrden, orden.DNIafiliado, orden.DNIprestador FROM orden WHERE orden.DNIprestador IN(SELECT prestador.DNIprestador FROM prestador WHERE prestador.DNIprestador = ? AND prestador.estado = 1);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaDePago(rs.getString("formaDePago"));
                orden.setImporte(rs.getInt("importe"));
                orden.setDNIafiliado(rs.getInt("DNIafiliado"));
                orden.setDNIprestador(rs.getInt("DNIprestador"));
                ordenes.add(orden);
            }
            ps.close();
            System.out.println("OrdenesPres" + "\n" + ordenes);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }
}
