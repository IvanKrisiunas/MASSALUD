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
        String sql = "SELECT * FROM especialidad";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
                especialidad.setTipo(rs.getString("tipo"));
                especialidades.add(especialidad);
            }
            ps.close();
            System.out.println("Activo(s)" + "\n" + especialidades);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla especialidad." + "\n" + "(" + ex.getMessage() + ")");
        }
        return especialidades;

    }

    public void añadirEspecialidad(Especialidad especialidad) {
        String sql = "INSERT INTO especialidad(idEspecialidad, tipo) "
                + "VALUES ('', ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, especialidad.getTipo());
            ps.executeUpdate();
            System.out.println("* * * Método ejecutado correctamente. * * *");
            listarEspecialidades();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla especialidad." + "\n" + "(" + ex.getMessage() + ")");
        }
    }

    public void modificarEspecialidad(Especialidad especialidad) {
        String sql = "UPDATE especialidad SET tipo = ? WHERE idEspecialidad = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, especialidad.getTipo());
            ps.setInt(2, especialidad.getIdEspecialidad());
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
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla especialidad." + "\n" + "(" + ex.getMessage() + ")");
        }

    }

    public Especialidad especialidadPorNombre(String tipo) {

        String sql = "SELECT * FROM especialidad WHERE tipo = ?";
        Especialidad especialidad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
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
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla especialidad." + "\n" + "(" + ex.getMessage() + ")");
        }
        return especialidad;

    }
}
