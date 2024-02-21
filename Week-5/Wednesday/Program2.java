import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class Program2 {
    public static void main(String args[]) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "root";

            Connection con = DriverManager.getConnection(url, username, password);

            // create a query
            String q="insert into table1(tName,tCity) values(?,?)";
            
            // get the PreparedStatement Object
            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name:");
            String name = br.readLine();

            System.out.println("Enter city:");
            String city = br.readLine();

            // set the value to query
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            
            pstmt.executeUpdate();

            System.out.println("Inserted...");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}