import java.sql.*;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce", "root", "senha");
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados.", e);
        }
    }
}
