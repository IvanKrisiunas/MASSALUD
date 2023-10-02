/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import massalud.Afiliado;
import massalud.Conexion;

/**
 *
 * @author Monica
 */
public class AfiliadoData {
    private Connection con = null;

    public AfiliadoData() {
        
        con = Conexion.getConexion();
    }
    
    public void guardarAfiliado(Afiliado afiliado){
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
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al sector AFILIADOS "+ex.getMessage());
        }
    }
    
}
