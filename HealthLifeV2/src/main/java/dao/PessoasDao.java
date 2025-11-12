package dao;

import model.Pessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoasDao {
    private final String URL = "jdbc:sqlite:UsuarioHealth";
    public void criar_tabela();
    { String sql = """
                CREATE TABLE Usuarios (
                  id mediumint(8) NOT NULL auto_increment,
                  nome varchar(100),
                  Idade mediumint,
                  Sus int,
                  Cpf int,
                  PRIMARY KEY (id)
                );
                """;
        try (Connection conn = DriverManager.getConnection(URL);
                 Statement stmt = conn.createStatement()) {


            stmt.execute(sql);
            System.out.println("tabela criada");


        } catch (SQLException e) {
            e.printStackTrace();}}}
