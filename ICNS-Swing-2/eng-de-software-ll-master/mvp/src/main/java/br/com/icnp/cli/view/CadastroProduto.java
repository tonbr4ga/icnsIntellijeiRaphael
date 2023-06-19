package br.com.icnp.cli.view;

import br.com.icnp.cli.DAO.FuncionarioDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProduto extends JFrame {

    FuncionarioDAO funcionarioDAO;

    public CadastroProduto(FuncionarioDAO funcionarioDAO){
        this.funcionarioDAO = funcionarioDAO;
        this.montaJanela();
    }

    private JLabel labelTitleICNS;
    private JLabel labelTitleNota;
    private JLabel labelTitleProduto;
    private JLabel labelChaveNota;
    private JLabel labelNome;
    private JLabel labelValorTotal;
    private JLabel labelCodigoProduto;
    private JLabel labelQuantidadeProdutosCadastradosNota;
    private JLabel labelPrecoUnitarioProduto;
    private JLabel labelTipoProduto;
    private JLabel labelVidautil;
    private JLabel labelQuantidadeProduto;

    private JTextField txtChaveNota;
    private JTextField txtNomeProduto;
    private JTextField txtValorTotal;
    private JTextField txtCodigoProduto;
    private JTextField txtQuantidadeProdutoCadastradosNota;
    private JTextField txtPrecoUnitario;
    private JTextField txtTipoProduto;
    private JTextField txtVidaUtil;
    private JTextField txtQuantidadeProduto;

    private JButton botaoVoltar;

    private JFrame janela;

    public JButton getBotaoVoltar() {
        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setForeground(Color.white);

        botaoVoltar.setBounds(new Rectangle(700, 375, 75, 25));

        botaoVoltar.setBackground(new Color(170, 12, 12));
        botaoVoltar.setToolTipText("Pressione aqui para retornar.");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HubProduto HubProduto = new HubProduto(funcionarioDAO);
                janela.dispose();
            }

        };
        botaoVoltar.addActionListener(listener);

        return botaoVoltar;
    }


    public JLabel getLabelTitleNota() {
        labelTitleNota = new JLabel("Nota");
        labelTitleNota.setForeground(Color.black);
        labelTitleNota.setFont(new Font("", Font.BOLD, 10));
        labelTitleNota.setBounds(new Rectangle(40, 40, 50, 20));
        return labelTitleNota;
    }

    public JLabel getLabelTitleProduto() {
        labelTitleProduto = new JLabel("Produto");
        labelTitleProduto.setForeground(Color.black);
        labelTitleProduto.setFont(new Font("", Font.BOLD, 14));
        labelTitleProduto.setBounds(new Rectangle(440, 40, 50, 20));
        return labelTitleProduto;
    }

    public JLabel getLabelChaveNota() {
        labelChaveNota = new JLabel("Chave Nota");
        labelChaveNota.setForeground(Color.black);
        labelChaveNota.setFont(new Font("", Font.BOLD, 10));
        labelChaveNota.setBounds(new Rectangle(40, 120, 100, 20));
        return labelChaveNota;
    }

    public JLabel getLabelNome() {
        labelNome = new JLabel("Nome");
        labelNome.setForeground(Color.black);
        labelNome.setFont(new Font("", Font.BOLD, 14));
        labelNome.setBounds(new Rectangle(440, 80, 50, 20));
        return labelNome;
    }

    public JLabel getLabelValorTotal() {
        labelValorTotal = new JLabel("Valor Total");
        labelValorTotal.setForeground(Color.black);
        labelValorTotal.setFont(new Font("", Font.BOLD, 10));
        labelValorTotal.setBounds(new Rectangle(40, 200, 100, 20));

        return labelValorTotal;
    }


    public JLabel getLabelCodigoProduto() {
        labelCodigoProduto = new JLabel("Código de Produto");
        labelCodigoProduto.setForeground(Color.black);
        labelCodigoProduto.setFont(new Font("", Font.BOLD, 10));
        labelCodigoProduto.setBounds(new Rectangle(440, 80, 150, 20));
        return labelCodigoProduto;
    }

    public JLabel getLabelQuantidadeProdutosCadastradosNota() {
        labelQuantidadeProdutosCadastradosNota = new JLabel("Quantidade de Produtos a ser Cadastrados");
        labelQuantidadeProdutosCadastradosNota.setForeground(Color.black);
        labelQuantidadeProdutosCadastradosNota.setFont(new Font("", Font.BOLD, 10));
        labelQuantidadeProdutosCadastradosNota.setBounds(new Rectangle(440, 120, 250, 20));
        return labelQuantidadeProdutosCadastradosNota;
    }

    public JLabel getLabelPrecoUnitarioProduto() {
        labelPrecoUnitarioProduto = new JLabel("Preço Unitário por Produto");
        labelPrecoUnitarioProduto.setForeground(Color.black);
        labelPrecoUnitarioProduto.setFont(new Font("", Font.BOLD, 10));
        labelPrecoUnitarioProduto.setBounds(new Rectangle(440, 160, 180, 20));
        return labelPrecoUnitarioProduto;
    }

    public JLabel getLabelTipoProduto() {
        labelTipoProduto = new JLabel("Tipo de Produto");
        labelTipoProduto.setForeground(Color.black);
        labelTipoProduto.setFont(new Font("", Font.BOLD, 10));
        labelTipoProduto.setBounds(new Rectangle(440, 200, 150, 20));
        return labelTipoProduto;
    }

    public JLabel getLabelVidautil() {
        labelVidautil = new JLabel("Vida Útil");
        labelVidautil.setForeground(Color.black);
        labelVidautil.setFont(new Font("", Font.BOLD, 10));
        labelVidautil.setBounds(new Rectangle(440, 240, 50, 20));
        return labelVidautil;
    }

    public JLabel getLabelQuantidadeProduto() {
        labelQuantidadeProduto = new JLabel("Quantidade De Produtos");
        labelQuantidadeProduto.setForeground(Color.black);
        labelQuantidadeProduto.setFont(new Font("", Font.BOLD, 10));
        labelQuantidadeProduto.setBounds(new Rectangle(440, 280, 180, 20));
        return labelQuantidadeProduto;
    }

    public JTextField getTxtChaveNota() {
        txtChaveNota = new JTextField(50);
        txtChaveNota.setBounds(new Rectangle(40, 140, 180, 20));
        return txtChaveNota;
    }

    public JTextField getTxtNomeProduto() {
        txtNomeProduto = new JTextField(50);
        txtNomeProduto.setBounds(new Rectangle(440, 80, 180, 20));
        return txtNomeProduto;
    }

    public JTextField getTxtValorTotal() {
        txtValorTotal = new JTextField(50);
        txtValorTotal.setBounds(new Rectangle(40, 220, 180, 20));
        return txtValorTotal;
    }

    public JTextField getTxtCodigoProduto() {
        txtCodigoProduto = new JTextField(50);
        txtCodigoProduto.setBounds(new Rectangle(40, 260, 180, 20));
        return txtCodigoProduto;
    }

    public JTextField getTxtQuantidadeProdutoCadastradosNota() {
        txtQuantidadeProdutoCadastradosNota = new JTextField(50);
        txtQuantidadeProdutoCadastradosNota.setBounds(new Rectangle(40, 300, 180, 20));
        return txtQuantidadeProdutoCadastradosNota;
    }

    public JTextField getTxtPrecoUnitario() {
        txtPrecoUnitario = new JTextField(50);
        txtPrecoUnitario.setBounds(new Rectangle(40, 340, 180, 20));
        return txtPrecoUnitario;
    }

    public JTextField getTxtTipoProduto() {
        txtTipoProduto = new JTextField(50);
        txtTipoProduto.setBounds(new Rectangle(40, 380, 180, 20));
        return txtTipoProduto;
    }

    public JTextField getTxtVidaUtil() {
        txtVidaUtil = new JTextField(50);
        txtVidaUtil.setBounds(new Rectangle(40, 420, 180, 20));
        return txtVidaUtil;
    }

    public JTextField getTxtQuantidadeProduto() {
        txtQuantidadeProduto = new JTextField(50);
        txtQuantidadeProduto.setBounds(new Rectangle(40, 460, 180, 20));
        return txtQuantidadeProduto;
    }

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
        janela.getContentPane().add(getLabelTitleNota());
        janela.getContentPane().add(getLabelTitleProduto());
        janela.getContentPane().add(getLabelChaveNota());
        janela.getContentPane().add(getLabelNome());
        janela.getContentPane().add(getLabelValorTotal());
        janela.getContentPane().add(getLabelCodigoProduto());
        janela.getContentPane().add(getLabelQuantidadeProdutosCadastradosNota());
        janela.getContentPane().add(getLabelQuantidadeProduto());
        janela.getContentPane().add(getLabelTipoProduto());
        janela.getContentPane().add(getLabelVidautil());
        janela.getContentPane().add(getLabelPrecoUnitarioProduto());

        janela.getContentPane().add(getTxtChaveNota());
        janela.getContentPane().add(getTxtNomeProduto());
        janela.getContentPane().add(getTxtValorTotal());
        janela.getContentPane().add(getTxtCodigoProduto());
        janela.getContentPane().add(getTxtQuantidadeProduto());
        janela.getContentPane().add(getTxtQuantidadeProdutoCadastradosNota());
        janela.getContentPane().add(getTxtPrecoUnitario());
        janela.getContentPane().add(getTxtTipoProduto());
        janela.getContentPane().add(getTxtVidaUtil());






        janela.setVisible(true);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
