package AccesoADatos;

import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "SELECT * FROM orden WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setNombre(rs.getString("nombre"));
                orden.setApellido(rs.getString("apellido"));
                orden.setDNI(rs.getInt("DNI"));
                orden.setEstado(rs.getBoolean("estado"));
                orden.setIdEspecialidad(rs.getInt("idEspecialidad"));
                orden.setDomicilio(rs.getString("domicilio"));
                orden.setTelefono(rs.getInt("telefono"));
                ordenes.add(orden);
            }
            ps.close();
            System.out.println("Activo(s)" +"\n" + ordenes);
            System.out.println("Inactivo(s): " + "\n" + listarOrdenesEliminados());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla orden." + "\n" + "(" + ex.getMessage() + ")");
        }
        return ordenes;

    }
}
