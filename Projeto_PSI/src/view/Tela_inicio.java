package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_inicio {
    String UsuárioNome;
    String UsuárioSenha;
    JTextField Campo_nome;
    JTextField Campo_Senha;
    JTextField Telefone;
    JTextField Email;

    public Tela_inicio(){
        UsuárioNome = " ";
        UsuárioSenha = " ";
        Campo_nome = new JTextField();
        Campo_Senha = new JTextField();
        Telefone = new JTextField();
        Email = new JTextField();
    }
    public void tela_inicio (){

        //Definindo o tamnho
        JFrame Login = new JFrame("Health life");
        Login.setLayout(null);
         Login.setSize(1000,1000);

        // deixando visivel
         Login.setVisible(true);
         // Formulario de login
        JLabel titulo = new JLabel("Entre com sua conta");
        titulo.setBounds(535,120,400,125); // dimensionamento
        titulo.setFont(new Font("times new roman",Font.BOLD,35)); // fonte
        Login.add(titulo); // chamando componentes

        // Canpos de coleta de dados
        JLabel Nome = new JLabel("Nome");
        Login.add(Nome);
        Nome.setBounds(670,235,80,25);
        Login.add(Campo_nome);
        Campo_nome.setBounds(590,270,200,16);

        JLabel Senha = new JLabel("Senha");
        Login.add(Senha);
        Senha.setBounds(670,300,80,25);
        Login.add(Campo_Senha);
        Campo_Senha.setBounds(590,345,200,16);

        JButton botao = new JButton("Entrar ");
        Login.add(botao);
        botao.setBounds(645,400,80,25);

        // simulando uma box shadow
        JPanel fundo = new JPanel();
        fundo.setBackground(Color.GRAY);
        fundo.setBounds(435,120,500,500);
        Login.add(fundo);

        // plano de fundo
        JPanel fundo2 = new JPanel();
        fundo2.setBackground(Color.black);
        fundo2.setBounds(0,0,2000,2000);
        Login.add(fundo2);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Login,"Verificado sua integridade...");
            }
        });
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //adiciona p botão para fechar
    }
}
