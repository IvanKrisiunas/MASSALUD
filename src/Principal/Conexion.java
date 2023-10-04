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
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base datos, comprueba tu conexión a la red." + "\n" + "(" + ex.getMessage() + ")");
                System.exit(0);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "O hay un error de carga de driver o no estás conectado a la red" + "\n" + "(" + ex.getMessage() + ")");
                System.exit(0);
            }
            System.out.println("Conexión realizada.");
        }
        return connection;
    }
}
