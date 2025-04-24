package view;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {

    private List<Conta> listadeContas = new ArrayList<>();

    public static void main(String[] args){
        GerenciarContas gc = new GerenciarContas();
        //Duas correntes novas + 1 poupança

        ContaCorrente conta1 = new ContaCorrente(1,"Carlos",1000.0);
        ContaCorrente conta2 = new ContaCorrente(2,"Maria",1000.0);
        ContaPoupanca conta3 = new ContaPoupanca(3, "Zé",0.031);

        //Depositar e sacar da conta1. (dep 1000.0 Saq: 300
        boolean ok = conta1.depositar(1000.0);
        if (ok){
            System.out.println("Dep ef com sucesso");
        }else {
            System.out.println("Valor invalido para dep");
        }

        ok = conta1.sacar(300.00);
        if (ok){
            System.out.println("Sq ef com sucesso");
        }else {
            System.out.println("Sem saldo suficiente");
        }
        gc.listadeContas.add(conta1);
        gc.listadeContas.add(conta2);
        gc.listadeContas.add(conta3);
        conta2.depositar(100);
        conta3.depositar(50);

        double total = 0;
        for (Conta conta : gc.listadeContas){
            total += conta.getSaldo();
        }

        System.out.println("Total de todas as contas R$ " + total);
    }


}