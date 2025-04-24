import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarControlePonto
{
    List<RegistroPonto> resgistrosPonto = new ArrayList<RegistroPonto>();
    int id;

    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        Secretaria secretaria = new Secretaria();
        Operador operador = new Operador();

        gerente.setIdFunc(1);
        gerente.setNome("Robson");
        gerente.setEmail("Robson21@gmail.com");
        gerente.setDocumento("1234543");
        gerente.setLogin(gerente.getEmail());
        gerente.setSenha("BalaozinhoVeio001");

        secretaria.setIdFunc(2);
        secretaria.setNome("Maria");
        secretaria.setEmail("mariadocarmo@gmail.com");
        secretaria.setDocumento("443221");
        secretaria.setTelefone("(19)40028922");
        secretaria.setRamal("9090");

        operador.setIdFunc(3);
        operador.setNome("Juliao");
        operador.setEmail("Juliao001@gmail.com");
        operador.setDocumento("68765");
        operador.setValorHora(5.00);

        GerenciarControlePonto gcp = new GerenciarControlePonto();
        gcp.registrarPonto(gerente);
        gcp.registrarPonto(operador);
        gcp.registrarPonto(secretaria);

        for ( RegistroPonto registroPonto : gcp.resgistrosPonto){
            registroPonto.apresentarRegistroPonto(false);

        }

        for ( RegistroPonto registroPonto : gcp.resgistrosPonto){
            registroPonto.apresentarRegistroPonto(true);

        }

    }

    void registrarPonto(Funcionario func) throws InterruptedException {
        RegistroPonto registroPonto = new RegistroPonto();

        Scanner scanner = new Scanner(System.in);
        registroPonto.setIdRegPonto(id++);
        registroPonto.setFunc(func);
        registroPonto.setDataRegistro(LocalDate.now());

        System.out.println("Digite seu horário de saída " + registroPonto.getFunc().getNome());
        System.out.println("Hora");
        int hora = scanner.nextInt();
        System.out.println("Minuto(s)");
        int minuto = scanner.nextInt();
        System.out.println("Segundo(s)");
        int segundos = scanner.nextInt();
        Thread.sleep(1000);

        registroPonto.setHoraEntrada(LocalDateTime.now());
        registroPonto.setHoraSaida(LocalDateTime.of(LocalDate.now(),LocalTime.of(hora, minuto, segundos)));

        resgistrosPonto.add(registroPonto);


    }
}