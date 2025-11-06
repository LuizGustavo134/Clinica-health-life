package dao;
import model.Paciente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Usuariodao {
    public void inserir(Paciente paciente){
        String sql = "insert into usuarios (nome,idade,sus,cpf) VALUES (?,?,?,?)";
        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1,paciente.getNome());
            stmt.setInt(2,paciente.getIdade());
            stmt.setInt(3,paciente.getSUS());
            stmt.setInt(4,paciente.getCpf());
            stmt.executeUpdate();

            System.out.println("cadastro realizado com sucesso");
        }catch (SQLException e){
            System.out.println("erro ao cadastrar!!" + e.getMessage());
        }
    }
}
