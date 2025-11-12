package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar(){
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/HealthLife?useSSL=false&serverTimezone=UTC";
            String usuario = "root";
            String senha = ""; // sem espaço

            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("✅ Conexão bem-sucedida!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC não encontrado!");
        } catch (SQLException e) {
            System.out.println("❌ Erro de conexão: " + e.getMessage());
        }
        return conexao;
    }
}
