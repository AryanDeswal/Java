import java.io.FileInputStream;
import java.sql.*;

public class Program3 {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "root";

            Connection con = DriverManager.getConnection(url, username, password);

            // create a query
            String q = "insert into images(pic) values(?)";

            // get the PreparedStatement Object
            PreparedStatement pstmt = con.prepareStatement(q);

            // set the value to query
            FileInputStream fis = new FileInputStream("C:\\Users\\Aryan Deswal\\Pictures\\Saved Pictures\\13..jpg");

            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();

            System.out.println("Inserted...");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
