package br.com.icnp.cli.view;

import br.com.icnp.cli.DAO.FuncionarioDAO;

import javax.swing.*;
import java.awt.*;

public class AlterarProduto extends JFrame {
    FuncionarioDAO funcionarioDAO;

    public AlterarProduto(FuncionarioDAO funcionarioDAO){
        this.funcionarioDAO = funcionarioDAO;
        this.montaJanela();
    }

    private JLabel labelTitleICNS;

    private JFrame janela;
    private JLabel getLabelTitleICNS() {
        labelTitleICNS = new JLabel("ICNS - Logado - Manager");
        labelTitleICNS.setForeground(Color.black);
        labelTitleICNS.setFont(new Font("", Font.BOLD, 14));
        labelTitleICNS.setBounds(new Rectangle(10, 10, 180, 25));
        return labelTitleICNS;
    }

    public void montaJanela(){
        janela = new JFrame();
        janela.setTitle("Projeto ICNS - Gerenciamento ");
        janela.setSize(800, 600);
        janela.setLocation(300, 150);
        janela.setLayout(null);
        janela.setResizable(true);
        janela.getContentPane().setBackground(new Color(255, 165, 0));


        janela.getContentPane().add(getLabelTitleICNS());


        janela.setVisible(true);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
