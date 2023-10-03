package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "massalud";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    private static Connection connection;

    public Conexion() {

    }

    public static Connection getConexion() {
        boolean conexión = false;
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                conexión = true;
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base datos, comprueba tu conexión a la red: " + ex.getMessage());
                conexión = false;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "O hay un error de carga de driver o no estás conectado a la red" + "\n" + ex.getMessage());
                conexión = false;
            }
        }
        if (conexión == true) {
            System.out.println("ESTADO DE CONEXIÓN: conectado.");
        } else {
            System.out.println("ESTADO DE CONEXIÓN: desconectado.");
        }
        return connection;
    }
}
