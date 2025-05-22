
public class Exemplo
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno(11,"José", "email@gmail.com");
        Aluno aluno2 = new Aluno(12, "Maria", "email@gmail.com");
        Aluno aluno3 = new Aluno(13, "Mariangela", "email@gmail.com");

        System.out.println(aluno3.hashCode());;
        System.out.println(aluno1.equals(aluno3));
    }
}