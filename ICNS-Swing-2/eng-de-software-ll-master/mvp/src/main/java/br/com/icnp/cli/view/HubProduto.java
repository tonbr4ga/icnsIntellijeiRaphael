package br.com.icnp.cli.view;

import br.com.icnp.cli.DAO.FuncionarioDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HubProduto extends JFrame {

    FuncionarioDAO funcionarioDAO;

    public HubProduto(FuncionarioDAO funcionarioDAO){
        this.funcionarioDAO = funcionarioDAO;
        this.montaJanela();
    }

    private JLabel labelTitleICNS;

    private JFrame janela;

    private JButton botaoCadastrarProduto;
    private JButton botaoAlterarProduto;
    private JButton botaoBuscarProduto;
    private JButton botaoBuscarTodosProdutos;
    private JButton botaoExcluirProduto;
    private JButton botaoVoltar;

    private JLabel getLabelTitleICNS() {
        labelTitleICNS = new JLabel("ICNS - Logado - Manager");
        labelTitleICNS.setForeground(Color.black);
        labelTitleICNS.setFont(new Font("", Font.BOLD, 14));
        labelTitleICNS.setBounds(new Rectangle(10, 10, 180, 25));
        return labelTitleICNS;
    }



    public JButton getBotaoCadastrarProduto() {
        botaoCadastrarProduto = new JButton("Cadastrar Produto");
        botaoCadastrarProduto.setForeground(Color.white);
        botaoCadastrarProduto.setBounds(new Rectangle(320, 125, 180, 25));

        botaoCadastrarProduto.setBackground(new Color(170, 12, 12));
        botaoCadastrarProduto.setToolTipText("Pressione aqui para Cadastrar Produto.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroProduto CadastroProduto = new CadastroProduto(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoCadastrarProduto.addActionListener(listener);

        return botaoCadastrarProduto;
    }

    public JButton getBotaoAlterarProduto() {
        botaoAlterarProduto = new JButton("Alterar Produto");
        botaoAlterarProduto.setForeground(Color.white);
        botaoAlterarProduto.setBounds(new Rectangle(320, 175, 180, 25));

        botaoAlterarProduto.setBackground(new Color(170, 12, 12));
        botaoAlterarProduto.setToolTipText("Pressione aqui para Alterar um Produto.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AlterarProduto AlterarProduto = new AlterarProduto(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoAlterarProduto.addActionListener(listener);
        return botaoAlterarProduto;
    }

    public JButton getBotaoBuscarProduto() {
        botaoBuscarProduto = new JButton("Buscar um Produto");
        botaoBuscarProduto.setForeground(Color.white);
        botaoBuscarProduto.setBounds(new Rectangle(320, 225, 180, 25));

        botaoBuscarProduto.setBackground(new Color(170, 12, 12));
        botaoBuscarProduto.setToolTipText("Pressione aqui para Buscar um Produto.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BuscarProduto BuscarProduto = new BuscarProduto(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoBuscarProduto.addActionListener(listener);
        return botaoBuscarProduto;
    }

    public JButton getBotaoBuscarTodosProdutos() {
        botaoBuscarTodosProdutos = new JButton("Buscar todos os Produto");
        botaoBuscarTodosProdutos.setForeground(Color.white);
        botaoBuscarTodosProdutos.setBounds(new Rectangle(320, 275, 180, 25));

        botaoBuscarTodosProdutos.setBackground(new Color(170, 12, 12));
        botaoBuscarTodosProdutos.setToolTipText("Pressione aqui para Buscar todos os Produto.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BuscarTodosProdutos BuscarTodosProdutos = new BuscarTodosProdutos(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoBuscarTodosProdutos.addActionListener(listener);
        return botaoBuscarTodosProdutos;
    }

    public JButton getBotaoExcluirProduto() {
        botaoExcluirProduto = new JButton("Excluir um Produto");
        botaoExcluirProduto.setForeground(Color.white);

        botaoExcluirProduto.setBounds(new Rectangle(320, 325, 180, 25));

        botaoExcluirProduto.setBackground(new Color(170, 12, 12));
        botaoExcluirProduto.setToolTipText("Pressione aqui para Excluir um Produto.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ExcluirProduto ExcluirProduto = new ExcluirProduto(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoExcluirProduto.addActionListener(listener);
        return botaoExcluirProduto;
    }

    public JButton getBotaoVoltar() {
        botaoVoltar = new JButton("Sair");
        botaoVoltar.setForeground(Color.white);

        botaoVoltar.setBounds(new Rectangle(700, 375, 75, 25));

        botaoVoltar.setBackground(new Color(170, 12, 12));
        botaoVoltar.setToolTipText("Pressione aqui para retornar.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login Login = new Login(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoVoltar.addActionListener(listener);

        return botaoVoltar;
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

        janela.getContentPane().add(getBotaoCadastrarProduto());
        janela.getContentPane().add(getBotaoAlterarProduto());
        janela.getContentPane().add(getBotaoBuscarProduto());
        janela.getContentPane().add(getBotaoBuscarTodosProdutos());
        janela.getContentPane().add(getBotaoExcluirProduto());
        janela.getContentPane().add(getBotaoVoltar());



        janela.setVisible(true);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
