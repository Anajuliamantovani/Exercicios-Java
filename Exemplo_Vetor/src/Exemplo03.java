import java.util.Arrays;

public class Exemplo03 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        //preencher todas as posilçies com o valor 99
        Arrays.fill(vetor, 99);

        for(int x: vetor){
            System.out.println(x);
        }
    }
}
