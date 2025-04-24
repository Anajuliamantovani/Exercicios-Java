package model;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(int numConta, String nomeCliente, double taxaJuros) {
        super(numConta, nomeCliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void cobrarTaxaManutencao() {
        System.out.println("Taxa manutenção poupança R$ 0,00");
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Taxa de juros" + taxaJuros;
        return texto;
    }
}
