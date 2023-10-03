package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Principal.Afiliado;
import Principal.Conexion;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfiliadoData {

    private Connection con = null;

    public AfiliadoData() {
        con = Conexion.getConexion();
    }

    public void añadirAfiliado(Afiliado afiliado) {
        String sql = "INSERT INTO afiliado(idAfiliado, nombre, apellido, DNI, domicilio, telefono, estado) "
                + "VALUES ('', ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDNI());
            ps.setString(4, afiliado.getDomicilio());
            ps.setInt(5, afiliado.getTelefono());
            ps.setBoolean(6, afiliado.isActivo());
            ps.executeUpdate();
            System.out.println("* * * Método ejecutado correctamente. * * *");
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla afiliado." + "\n" + "(" + ex.getMessage() + ")");
        }
    }

    public void modificarAfiliado(Afiliado afiliado) {
        String sql = "UPDATE afiliado SET nombre = ?,"
                + " apellido = ?, DNI = ?, domicilio = ?, telefono = ?, estado = ? WHERE DNI = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(7, afiliado.getDNI());
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDNI());
            ps.setString(4, afiliado.getDomicilio());
            ps.setInt(5, afiliado.getTelefono());
            ps.setBoolean(6, afiliado.isActivo());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("* * * Método ejecutado correctamente. * * *");
                System.out.println(listarAfiliados());
            } else {
                System.out.println("* * * Método ejecutado incorrectamente. * * *");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla afiliado." + "\n" + "(" + ex.getMessage() + ")");
        }

    }

    public List<Afiliado> listarAfiliados() {
        List<Afiliado> afiliados = new ArrayList();
        String sql = "SELECT * FROM afiliado WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDNI(rs.getInt("DNI"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setActivo(rs.getBoolean("estado"));
                afiliados.add(afiliado);
            }
            ps.close();
            System.out.println("Eliminado: " + "\n" + listarAfiliadosEliminados());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla afiliado." + "\n" + "(" + ex.getMessage() + ")");
        }
        return afiliados;

    }

    public void eliminarAfiliado(int dni) {
        String sql = "UPDATE afiliado SET estado = 0 WHERE DNI = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
//                JOptionPane.showMessageDialog(null, "Se elimino el alumno.");
                System.out.println("Se elimino el alumno");
                System.out.println(listarAfiliadosEliminados());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla afiliado." + "\n" + "(" + ex.getMessage() + ")");
        }
    }

    public List<Afiliado> listarAfiliadosEliminados() {
        List<Afiliado> afiliados = new ArrayList();
        String sql = "SELECT * FROM afiliado WHERE estado = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDNI(rs.getInt("DNI"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setActivo(rs.getBoolean("estado"));
                afiliados.add(afiliado);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla afiliado." + "\n" + "(" + ex.getMessage() + ")");
        }
        return afiliados;

    }
}
