public class Computador {
    String marca;
    String cor;
    String modelo;
    long numeroSerie;
    double preco;

    public void imprimir()
    {
        System.out.println("MARCA: " + marca);
        System.out.println("COR: " + cor);
        System.out.println("MODELO: " + modelo);
        System.out.println("NUMERO DA SERIE: " + numeroSerie);
        System.out.println("PREÇO: " + preco);
        System.out.println("==================================");
    }
    public void calcularValor()
    {
        switch (marca) {

            case "HP":
                preco = preco * 1.3;
                break;

            case "IBM":
                preco = preco * 1.5;
                break;

            default:
                break;
        }
    }
    public int alterarValor(double novoValor)
    {
        if (novoValor > 0)
        {
            preco = novoValor;
            return 1;
        }else {
            return 0;
        }
    }
}
