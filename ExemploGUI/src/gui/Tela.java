package gui;

import bus.Caixa;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame
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
        add(cmdDepositar);

        cmdDSacar = new Button("Sacar");
        cmdDSacar.setSize(dButton);
        cmdDSacar.setLocation(225,150);
        add(cmdDSacar);

        cmdConsultar = new Button("Consultar");
        cmdConsultar.setSize(dButton);
        cmdConsultar.setLocation(25,185);
        add(cmdConsultar);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
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
}
