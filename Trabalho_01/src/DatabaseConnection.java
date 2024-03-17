/**
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_supermarket";
    private static final String DB_USER = "ligia";
    private static final String DB_PASSWORD = "Lm03101993";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
