import java.util.Objects;

public class Aluno
{
    private int ra;
    private String nome;
    private String email;

    public Aluno(int ra, String nome, String email)
    {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }

    public Aluno()
    {

    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getRa()
    {
        return ra;
    }

    public void setRa(int ra)
    {
        this.ra = ra;
    }

    @Override
    public String toString()
    {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return ra == aluno.ra;
    }

    @Override
    public int hashCode()
    {
        return nome.length(); //comprimento do nome
    }
}
