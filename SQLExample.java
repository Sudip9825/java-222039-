import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample {
    public static void main(String[] args) {
        // JDBC URL for SQL Server
        String url = "jdbc:sqlserver://localhost:1433;databaseName=my_database";
        String username = "sa"; // Replace with your SQL Server username
        String password = "your_password"; // Replace with your SQL Server password

        Connection connection = null;

        try {
            // Connect to the SQL Server database
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Example: Query the database
            String sql = "SELECT * FROM users";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
