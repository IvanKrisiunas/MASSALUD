package AccesoADatos;

import Principal.Conexion;
import Principal.Prestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestadorData {
    
    String prestadorNombre;
    
     private Connection con = null;

    public PrestadorData() {
        con = Conexion.getConexion();
    }
//    (String nombre, String apellido, int DNI, boolean estado, Especialidad especialidad
    public List<Prestador> listarPrestadores() {
        List<Prestador> prestadores = new ArrayList();
        String sql = "SELECT * FROM prestador WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestador prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDNI(rs.getInt("DNI"));
                prestador.setEstado(rs.getBoolean("estado"));
                prestador.setIdEspecialidad(rs.getInt("idEspecialidad"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));
                prestadores.add(prestador);
            }
            ps.close();
            System.out.println("Activo(s)" +"\n" + prestadores);
            System.out.println("Inactivo(s): " + "\n" + listarPrestadoresEliminados());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla prestador." + "\n" + "(" + ex.getMessage() + ")");
        }
        return prestadores;

    }
    
        public List<Prestador> listarPrestadoresEliminados() {
        List<Prestador> prestadores = new ArrayList();
        String sql = "SELECT * FROM prestador WHERE estado = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestador prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDNI(rs.getInt("DNI"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));
                prestador.setEstado(rs.getBoolean("estado"));
                prestadores.add(prestador);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla prestador." + "\n" + "(" + ex.getMessage() + ")");
        }
        return prestadores;

    }

    public String listarPrestadorPorDNI(int DNIPrestador) {
        String sql = "SELECT nombre FROM prestadpr WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            Prestador prestador = new Prestador();
            ps.setInt(1, prestador.getDNI());
            prestador.setNombre(rs.getString("nombre"));
            ps.close();
            prestadorNombre = prestador.getNombre();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla prestador." + "\n" + "(" + ex.getMessage() + ")");
        }
        return prestadorNombre;
    }

    public void añadirPrestador(Prestador prestador) {
        String sql = "INSERT INTO prestador(idPrestador, nombre, apellido, DNI, domicilio, telefono, idEspecialidad, estado) "
                + "VALUES ('', ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDNI());
            ps.setString(4, prestador.getDomicilio());
            ps.setInt(5, prestador.getTelefono());
            ps.setInt(6, prestador.getIdEspecialidad());
            ps.setBoolean(7, prestador.isEstado());
            ps.executeUpdate();
            System.out.println("* * * Método ejecutado correctamente. * * *");
            listarPrestadores();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                prestador.setIdPrestador(rs.getInt("idPrestador"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla prestador." + "\n" + "(" + ex.getMessage() + ")");
        }
}

    public void modificarPrestador(Prestador prestador) {
        String sql = "UPDATE prestador SET nombre = ?,"
                + " apellido = ?, DNI = ?, domicilio = ?, telefono = ?, idEspecialidad = ?, estado = ? WHERE DNI = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(8, prestador.getDNI());
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDNI());
            ps.setString(4, prestador.getDomicilio());
            ps.setInt(5, prestador.getTelefono());
            ps.setInt(6, prestador.getIdEspecialidad());
            ps.setBoolean(7, prestador.isEstado());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("* * * Método ejecutado correctamente. * * *");
                listarPrestadores();
            } else {
                System.out.println("* * * Método ejecutado incorrectamente. * * *");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla prestador." + "\n" + "(" + ex.getMessage() + ")");
        }

    }

    public void eliminarPrestador(int dni) {
        String sql = "UPDATE prestador SET estado = 0 WHERE DNI = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                System.out.println("Se eliminó el prestador.");
                System.out.println(listarPrestadoresEliminados());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla prestador." + "\n" + "(" + ex.getMessage() + ")");
        }
    }
}
