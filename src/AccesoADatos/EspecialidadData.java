package AccesoADatos;

import Principal.Conexion;
import Principal.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EspecialidadData {

    private Connection con = null;

    public EspecialidadData() {
        con = Conexion.getConexion();
    }

    public List<Especialidad> listarEspecialidades() {
        List<Especialidad> especialidades = new ArrayList();
        String sql = "SELECT tipo FROM especialidad";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setTipo(rs.getString("tipo"));
                especialidades.add(especialidad);
            }
            ps.close();
            System.out.println("Especialidad(es)" + "\n" + especialidades);
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
    
        }
        return especialidades;
    }

    public void añadirEspecialidad(String tipo) {
        String sql = "INSERT INTO especialidad(idEspecialidad, tipo) "
                + "VALUES ('', ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tipo);
            ps.executeUpdate();
            System.out.println("* * * Método ejecutado correctamente. * * *");
            listarEspecialidades();
            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
//            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
    
        }
    }
    
    public void modificarEspecialidad(int idEspecialidad, String tipo) {
        String sql = "UPDATE especialidad SET tipo = ? WHERE idEspecialidad = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setInt(2, idEspecialidad);
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("* * * Método ejecutado correctamente. * * *");
                listarEspecialidades();
            } else {
                System.out.println("* * * Método ejecutado incorrectamente. * * *");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
    
        }

    }

    public Especialidad ListarEspecialidadPorId(int idEspecialidad) {
        String sql = "SELECT * FROM especialidad WHERE idEspecialidad = ?";
        Especialidad especialidad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEspecialidad);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
                especialidad.setTipo(rs.getString("tipo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la especialidad");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
    
        }
        return especialidad;
    }

    public String IdANombre(int idEspecialidad) {
        String tipo = "";
        String sql = "SELECT tipo FROM especialidad WHERE idEspecialidad = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEspecialidad);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipo = rs.getString("tipo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la especialidad");
            }
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
    
        }
        return tipo;
    }
    
    public int NombreAID(String tipo) {
        int idEspecialidad = 0;
        String sql = "SELECT idEspecialidad, tipo FROM especialidad WHERE tipo LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setTipo(rs.getString("tipo"));
                idEspecialidad = rs.getInt("idEspecialidad");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Un error SQL ha ocurrido." + "\n" + "(" + ex.getMessage() + ")");
    
        }
        return idEspecialidad;
    }
}
