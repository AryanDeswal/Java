import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                // load the driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create a connection
                String url = "jdbc:mysql://localhost:3306/jdbc";
                String username = "root";
                String password = "root";

                con = DriverManager.getConnection(url, username, password);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}