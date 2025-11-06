package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public static Connection conectar(){
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/HealthLife";
            String usuario = "root";
            String Senha = " "; // só se precisar
            conexao = DriverManager.getConnection(url,usuario,Senha);
            System.out.println("Conexão bem sucedida!!");
        } catch (SQLException e) {
            System.out.println("Erro de conexâo: "+ e.getMessage());}
        return conexao;
    }
}
