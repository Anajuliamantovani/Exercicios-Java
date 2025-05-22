import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       try
       {
           int num01;
           int num02;
           int resultado;

           Scanner sc = new Scanner(System.in);
           System.out.println("Digite um numero: ");
           num01 = Integer.parseInt(sc.nextLine());
           System.out.println("Digite outro numero: ");
           num02 = Integer.parseInt(sc.nextLine());

           resultado = num01 / num02;
           System.out.println("Resultado: " + resultado);
       } catch (NumberFormatException e)
       {
           System.out.println("Erro: valor deve ser inteiro");
       } catch (ArithmeticException e)
       {
           System.out.println("Impossivel dividir por Zero");
       }catch (Exception e ){
           System.out.println("Erro inesperado");
           System.out.println("Descrição do erro: " + e.getMessage());
       }finally {
           System.out.println("Fim do programa");
       }
    }
}