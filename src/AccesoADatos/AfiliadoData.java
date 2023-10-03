package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Principal.Afiliado;
import Principal.Conexion;

public class AfiliadoData {
    private Connection con = null;
    public AfiliadoData() {
        con = Conexion.getConexion();
    }
    
    public void añadirAfiliado(Afiliado afiliado){
        String sql = "INSERT INTO afiliado(idAfiliado, nombre, apellido, DNI, domicilio, telefono, estado) "
                + "VALUES ('', ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDNI());
            ps.setString(4, afiliado.getDomicilio());
            ps.setInt(5, afiliado.getTelefono());
            ps.setBoolean(6, afiliado.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                ps.close();
            }
            System.out.println("* * * Método ejecutado correctamente. * * *");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Un error SQL ha ocurrido en la tabla afiliado." + "\n" + "(" + ex.getMessage() + ")");
        }
    }
}
