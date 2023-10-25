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

public class AfiliadoData {

    String afiliadoNombre;

    private Connection con = null;

    public AfiliadoData() {
        con = Conexion.getConexion();
    }

    public List<Afiliado> listarAfiliados() {
        List<Afiliado> afiliados = new ArrayList();
        String sql = "SELECT  nombre, apellido, DNI, domicilio, telefono, estado FROM `afiliado` WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDNI(rs.getInt("DNI"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setEstado(rs.getBoolean("estado"));
                afiliados.add(afiliado);
            }
            ps.close();
            System.out.println("Afiliado(s) activo(s)" + "\n" + afiliados);
            System.out.println("Afiliado(s) inactivo(s): " + "\n" + listarAfiliadosEliminados());
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return afiliados;
    }

    public List<Afiliado> listarAfiliadosEliminados() {
        List<Afiliado> afiliados = new ArrayList();
        String sql = "SELECT  nombre, apellido, DNI, domicilio, telefono, estado FROM `afiliado` WHERE estado = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDNI(rs.getInt("DNI"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setEstado(rs.getBoolean("estado"));
                afiliados.add(afiliado);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return afiliados;
    }

    public Afiliado listarAfiliadoPorDNI(int DNIAfiliado) {
        String sql = "SELECT * FROM afiliado WHERE dni = ?";
        Afiliado afiliado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, DNIAfiliado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDNI(rs.getInt("DNI"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setEstado(rs.getBoolean("estado"));
            } else {
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return afiliado;
    }
    
    public Afiliado listarAfiliadoPorNombreApellido(String Nombre, String Apellido) {
        String sql = "SELECT * FROM afiliado WHERE nombre = ? AND apellido = ?";
        Afiliado afiliado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, Nombre);
            ps.setString(2, Apellido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDNI(rs.getInt("DNI"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setEstado(rs.getBoolean("estado"));
            } else {
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
        return afiliado;
    }

    public void añadirAfiliado(Afiliado afiliado) {
        int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea agregar un nuevo afiliado?", "Afiliados", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            String sql = "INSERT INTO afiliado(idAfiliado, nombre, apellido, DNI, domicilio, telefono, estado) "
                    + "VALUES ('', ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, afiliado.getNombre());
                ps.setString(2, afiliado.getApellido());
                ps.setInt(3, afiliado.getDNI());
                ps.setString(4, afiliado.getDomicilio());
                ps.setInt(5, afiliado.getTelefono());
                ps.setBoolean(6, afiliado.isEstado());
                ps.executeUpdate();
                System.out.println("* * * Método ejecutado correctamente. * * *");
                listarAfiliados();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                }

                ps.close();
            } catch (SQLException ex) {
                System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
            }
        } else {
                System.out.println("* * * Método cancelado correctamente. * * *");
        }
    }

    public void modificarAfiliado(Afiliado afiliado) {
        String sql = "UPDATE afiliado SET nombre = ?,"
                + " apellido = ?, domicilio = ?, telefono = ?, estado = ? WHERE DNI = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(6, afiliado.getDNI());
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setString(3, afiliado.getDomicilio());
            ps.setInt(4, afiliado.getTelefono());
            ps.setBoolean(5, afiliado.isEstado());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("* * * Método ejecutado correctamente. * * *");
                listarAfiliados();
            } else {
                System.out.println("* * * Método ejecutado incorrectamente. * * *");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }

    }

    public void eliminarAfiliado(int dni) {
        String sql = "UPDATE afiliado SET estado = 0 WHERE DNI = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                System.out.println("Se eliminó el afiliado.");
                System.out.println(listarAfiliadosEliminados());
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
        }
    }
}
