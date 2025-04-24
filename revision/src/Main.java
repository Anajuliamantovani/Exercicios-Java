import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        List<Pessoa> listaProfessor = new ArrayList<Pessoa>();
        String sair = "";
        Scanner scanner = new Scanner(System.in);

        while (!sair.equals("Nao")){
            Pessoa professor = new Pessoa();
            professor.addPessoa();
            listaProfessor.add(professor);

            System.out.println("Deseja sair ?: ");
            sair = scanner.nextLine();

        }

        for (int i = 0; i <= listaProfessor.size(); i++)
        {
            listaProfessor.get(i).impirimir();
        }

    }



}