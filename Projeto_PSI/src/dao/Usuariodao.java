package dao;
import model.Paciente;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Usuariodao {

    public void inserir(Paciente paciente) {
        String sql = "INSERT INTO usuarios (nome, idade, sus, cpf) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, paciente.getNome());
            stmt.setInt(2, paciente.getIdade());
            stmt.setInt(3, paciente.getSus());
            stmt.setInt(4, paciente.getCpf());
            stmt.executeUpdate();

            System.out.println("Cadastro realizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }



    public void limparTabela() {
        String sql = "DELETE FROM usuarios";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {
            int apagados = stmt.executeUpdate(sql);
            System.out.println("🧹 " + apagados + " registros removidos da tabela.");
        } catch (SQLException e) {
            System.out.println("Erro ao limpar tabela: " + e.getMessage());
        }
    }
}
