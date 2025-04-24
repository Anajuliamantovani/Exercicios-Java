public class Exemplo05 {
    public static void altera(Aluno aluno){
        aluno.ra = 12;
        aluno.nome = "Valeria Soares";
        aluno.imprimir();
    }
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.ra = 15;
        aluno.nome = "Maria Francisca";
        alterar(aluno);
        System.out.println();
        aluno.imprimir();
    }
}
