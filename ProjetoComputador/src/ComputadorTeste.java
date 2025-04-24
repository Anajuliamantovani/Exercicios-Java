public class ComputadorTeste {
    public static void main(String[] args)
    {
        Computador computador1 = new Computador();

        computador1.marca = "HP";
        computador1.preco = 2339.00;
        computador1.modelo = "G9";
        computador1.cor = "Preto";
        computador1.numeroSerie = 123343;

        computador1.calcularValor();
        computador1.alterarValor(computador1.preco);
        computador1.imprimir();

        Computador computador2 = new Computador();

        computador2.marca = "IBM";
        computador2.modelo = "Nao sei";
        computador2.cor = "Preto";
        computador2.preco = 2500.00;
        computador2.numeroSerie = 54352;

        computador2.calcularValor();
        computador2.alterarValor(computador2.preco);
        computador2.imprimir();

        Computador computador3 = new Computador();

        computador3.marca = "SANSUNG";
        computador3.modelo = "GALAXY BOOK";
        computador3.cor = "Preto";
        computador3.preco = 2700.00;
        computador3.numeroSerie = 5352;

        computador3.calcularValor();
        int resultado = computador3.alterarValor(2700);
        if (resultado == 1){
            System.out.println("Valor Alterado!!!");
        }else {
            System.out.println("Valor não alterado");
        }

        computador3.imprimir();
    }
}