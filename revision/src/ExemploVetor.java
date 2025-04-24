import java.util.Scanner;

public class ExemploVetor
{
    public static void main(String[] args)
    {
        int quantidadePessoa = 2;
        String sair;
        Scanner scanner = new Scanner(System.in);

        Pessoa professor = new Pessoa();
        Pessoa[] aluno = new Pessoa[quantidadePessoa];

        for (int i = 0; i < quantidadePessoa; i++)
        {
            aluno[i] = new Pessoa();
        }

        for (int i = 0; i < quantidadePessoa; i++)
        {
            aluno[i].addPessoa();
            System.out.println("Deseja sair ?");
            sair = scanner.nextLine();

            if (sair.equals("S"))
            {
                break;
            }else{
                continue;
            }

        }

        for (int i = 0; i < quantidadePessoa ; i++)
        {
            aluno[i].impirimir();
        }
    }
}
