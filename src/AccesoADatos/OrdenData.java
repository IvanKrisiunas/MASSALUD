package AccesoADatos;

import Principal.Conexion;
import Principal.Orden;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
            System.out.println("Orden(es) activa(s)" + "\n" + ordenes);
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }

    public int obtenerIdOrden(Orden orden) {
        String sql = "SELECT idOrden from orden WHERE (fecha, DNIAfiliado, DNIPrestador) "
                + "= (?,?,?);";
        int idOrden = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, orden.getDNIafiliado());
            ps.setInt(3, orden.getDNIprestador());
            ps.setDate(1, Date.valueOf(orden.getFecha()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idOrden = rs.getInt("idOrden");
            }
            ps.close();
            System.out.println("ID de Orden: " + orden.getIdOrden());
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return idOrden;
    }
    
    public Orden ListarOrdenPorId(int idOrden) {
        String sql = "SELECT * FROM orden WHERE idOrden = ?";
        Orden orden = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idOrden);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            orden = new Orden();
            orden.setIdOrden(rs.getInt("idOrden"));
            orden.setFecha(rs.getDate("fecha").toLocalDate());
            orden.setFormaDePago(rs.getString("formaDePago"));
            orden.setImporte(rs.getDouble("importe"));
            orden.setDNIafiliado(rs.getInt("DNIafiliado"));
            orden.setDNIprestador(rs.getInt("DNIprestador"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la orden.");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido en listar por ID." + "\n" + "(" + ex.getMessage() + ")");
        }
        return orden;
    }

    public void añadirOrden(Orden orden) {
        String sql = "INSERT INTO orden(DNIafiliado, DNIprestador, fecha, formaDePago, importe)"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
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
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
    }

    public void modificarOrden(int idOrden, Orden orden) {
        String sql = "UPDATE  orden SET DNIafiliado=?,"
                + "DNIprestador=?,fecha=?,formaDePago=?,importe=? WHERE idOrden = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, orden.getDNIafiliado());
            ps.setInt(2, orden.getDNIprestador());
            ps.setDate(3, Date.valueOf(orden.getFecha()));
            ps.setString(4, orden.getFormaDePago());
            ps.setDouble(5, orden.getImporte());
            ps.setInt(6, idOrden);
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
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }

    }

    public void eliminarOrden(int DNIafiliado, LocalDate fecha1, int DNIprestador) {
        java.sql.Date fecha = java.sql.Date.valueOf(fecha1);
        String sql = "DELETE FROM orden WHERE DNIafiliado = ? AND fecha = ? AND DNIprestador = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, DNIafiliado);
            ps.setDate(2, fecha);
            ps.setInt(3, DNIprestador);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                System.out.println("Se eliminó la orden.");
                listarOrdenes();
            } else {
                System.out.println("no se ejecuto correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
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
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
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
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }

    public List<Orden> ListaOrdenesPorFecha(LocalDate fecha) {
        List<Orden> ordenes = new ArrayList();
        java.sql.Date fechasql = java.sql.Date.valueOf(fecha);
        String sql = "SELECT idOrden, DNIafiliado, DNIprestador, fecha, formaDePago, importe FROM orden WHERE fecha = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, fechasql);
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
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }

}
