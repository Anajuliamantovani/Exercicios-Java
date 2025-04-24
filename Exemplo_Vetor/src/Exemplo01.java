public class Exemplo01 {
    public static void main(String[] args)
    {
        int v1[] = {3,5, 7, 9, 11, 13, 15, 17, 19, 21};
        int v2[] = new int[10];

        System.arraycopy(v1, 0, v2, 4, 5);

        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i]);

            //outra forma de pecorrer o vetor
            for (int x: v2){
                System.out.println(x);
            }

        }
    }
}