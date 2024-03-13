import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the database name you want to connect: ");
            String dbName = sc.nextLine();
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            // Construct the connection URL using PreparedStatement to prevent SQL injection
            String connectionUrl = "jdbc:mysql://localhost:3306/" + dbName;
            try (Connection con = DriverManager.getConnection(connectionUrl, username, password);
                 Statement st = con.createStatement(); // statement object
                 ResultSet rs = st.executeQuery("SELECT * FROM WORKER")) {
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
                }
            } catch (SQLException e) {
                System.err.println("Error executing SQL query: " + e.getMessage());
            }
        } finally {
            sc.close();
        }
    }
}