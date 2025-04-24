package ui;
import models.Carro;
import models.Pessoa;

import java.util.ArrayList;

public class Gerenciar_Estacionamento {

    //Simular um cliente com dois carros
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAnoFab(2000);
        carro1.setPlaca("FGK9447");

        Carro carro2 = new Carro();
        carro2.setMarca("Mitsubishi");
        carro2.setModelo("Lancer");
        carro2.setAnoFab(2020);
        carro2.setPlaca("GEG9920");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ana Julia");
        pessoa1.setIdade(20);
        pessoa1.setEmail("AnaJulia@fatec.com");

        pessoa1.adicionarCarro(carro2);
        pessoa1.adicionarCarro(carro1);
        //Imprimir dados da pessoa1
        pessoa1.imprimir();

        //remover carro
        pessoa1.removerCarro(carro1);
        pessoa1.imprimir();
    }

}
