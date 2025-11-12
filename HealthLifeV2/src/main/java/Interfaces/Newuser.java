package Interfaces;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Newuser extends JFrame {
    public void tela(){
        // janela
        JFrame cadastro = new JFrame("Clínica health life");
        cadastro.setLayout(null);
        cadastro.setSize(1000,1000);

        ////////////////////////////////////////////////////////////////
        // Campos de coleta de dados
        JLabel Nome = new JLabel("Nome");
        cadastro.add(Nome);
        Nome.setBounds(600,235,80,25);

        JTextField Usuario_Nome = new  JTextField(); //nome
        cadastro.add(Usuario_Nome);
        Usuario_Nome.setBounds(590,265,200,16);

        JLabel Idade = new JLabel("idade"); // idade
        cadastro.add(Idade);
        Idade.setBounds(600,305,80,25);

        JTextField Usuario_idade = new  JTextField();
        cadastro.add(Usuario_idade);
        Usuario_idade.setBounds(590,330,200,16);

        JLabel Sus = new JLabel("SUS"); //Sus
        cadastro.add(Sus);
        Sus.setBounds(600,360,200,16);

        JTextField Usuario_Sus = new  JTextField();
        cadastro.add(Usuario_Sus);
        Usuario_Sus.setBounds(590,390,200,16);

        JLabel Cpf = new JLabel("CPF"); //Sus
        cadastro.add(Cpf);
        Cpf.setBounds(600,420,200,16);

        JTextField Usuario_Cpf = new  JTextField();
        cadastro.add(Usuario_Cpf);
        Usuario_Cpf.setBounds(590,450,200,16);

        ///////////////////////////////////////////////////////////

        // simulando uma box shadow
        JPanel fundo = new JPanel();
        fundo.setBackground(Color.GRAY);
        fundo.setBounds(435,120,500,500);
        cadastro.add(fundo);

        // plano de fundo
        JPanel fundo2 = new JPanel();
        fundo2.setBackground(Color.black);
        fundo2.setBounds(0,0,2000,2000);
        cadastro.add(fundo2);


        JButton botao3 = new JButton("Voltar ? ");
        botao3.setBounds(630,550,120,25);
        cadastro.add(botao3);

        botao3.addActionListener(e -> {
          new Home().tela_inicio();
            cadastro.dispose();

        });

        JButton botao4 = new JButton(" Enviar ");
        botao4.setBounds(630,500,120,25);
        cadastro.add(botao4);
        botao4.addActionListener(e -> {
            JOptionPane.showMessageDialog(cadastro,"Enviando dados...");
        });



        // deixando a janela visivel
        cadastro.setVisible(true);
    }


}
