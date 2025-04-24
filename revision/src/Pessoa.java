import java.util.Scanner;

public class Pessoa
{
    String nome;
    double altura;
    int idade;
    String estadoCivil;
    String genero;

    void addPessoa()
    {
        Scanner info = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = info.nextLine();

        System.out.println("Altura: ");
        altura = Double.parseDouble(info.nextLine());

        System.out.println("Idade: ");
        idade = Integer.parseInt(info.nextLine());

        System.out.println("Estado Civil: ");
        estadoCivil = info.nextLine();

        System.out.println("Genero: ");
        genero = info.nextLine();

    }

    void impirimir()
    {
        if (nome == null){
            return;
        }
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Genero: " + genero);
    }
}
