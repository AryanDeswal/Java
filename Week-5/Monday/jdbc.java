import java.sql.*;

class jdbc {
    public static void main(String args[]) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "root";

            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("Connection is Closed");
            } else {
                System.out.println("Connection Created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}