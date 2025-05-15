package gui;

import bus.Caixa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener
{
    private Dimension dLable, dTextField, dTxtArea, dFrame, dButton;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdDepositar, cmdDSacar, cmdConsultar, cmdSair;
    private TextArea txtMsg;
    private Caixa caixa;

    //metodo construtor
    public Tela()
    {
        definirTamanhos();
        definiarJanela();
        definirLables();
        definirTextFields();
        definirButtons();
        definirTextArea();
        caixa = new Caixa(); //instanciando o caixa
    }

    private void definirTextArea() {
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTxtArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);
    }

    private void definirButtons() {
        cmdDepositar = new Button("Depositar");
        cmdDepositar.setSize(dButton);
        cmdDepositar.setLocation(25,150);
        cmdDepositar.addActionListener(this);
        add(cmdDepositar);

        cmdDSacar = new Button("Sacar");
        cmdDSacar.setSize(dButton);
        cmdDSacar.setLocation(225,150);
        cmdDSacar.addActionListener(this);
        add(cmdDSacar);

        cmdConsultar = new Button("Consultar");
        cmdConsultar.setSize(dButton);
        cmdConsultar.setLocation(25,185);
        cmdConsultar.addActionListener(this);
        add(cmdConsultar);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        add(cmdSair);
    }

    private void definirTextFields() {
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);
    }

    private void definirLables() {
        lblValor = new Label("Valor");
        lblValor.setSize(dLable);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo");
        lblSaldo.setSize(dLable);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);
    }

    private void definiarJanela() {
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLayout(null); //definiremos os posicionamentos e tamanhos
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void definirTamanhos() {
        dFrame = new Dimension(350, 400);
        dLable = new Dimension(40,20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTxtArea = new Dimension(300,140);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == cmdDepositar){
            //logica do depositar aqui
            try {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                txtMsg.append("Deposito efetuado com sucesso! Valor" + valor + "\n");
                JOptionPane.showMessageDialog(null, "Sucesso ao depositar" ,"Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtValor.setText(null);
                txtValor.requestFocus();

                return;

            }catch (Exception erro){
                JOptionPane.showMessageDialog(null,"Sucesso, depositado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtValor.setText("");
                txtValor.requestFocus();
                return;
            }
        }
        if (e.getSource() == cmdDSacar){
            //logica do sacar aqui
            try {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.sacar(valor);
                txtMsg.append("Saque efetuado com sucesso! Valor" + valor + "\n");
                JOptionPane.showMessageDialog(null, "Sucesso ao Sacar" ,"Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtValor.setText(null);
                txtValor.requestFocus();
                return;

            }catch (Exception erro){
                JOptionPane.showMessageDialog(null,"Sucesso, sacado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtValor.setText("");
                txtValor.requestFocus();
                return;
            }
        }
        if (e.getSource() == cmdConsultar){
            //logica do consultar aqui
            double saldo = caixa.getSaldo();
            txtSaldo.setText(Double.toString(saldo));
            txtMsg.append("Saldo consultado atual: " + saldo + "\n");
            JOptionPane.showMessageDialog(null, "Consulta Saldo", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (e.getSource() == cmdSair){
            //logica do sair aqui
            System.exit(0);
        }
    }
}
