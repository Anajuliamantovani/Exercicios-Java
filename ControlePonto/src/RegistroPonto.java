import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RegistroPonto
{
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    void apresentarRegistroPonto(boolean saida)
    {
        System.out.println("Funcionario: " + getFunc().getNome());
        System.out.println("Data de Registro: " + getDataRegistro());
        System.out.println("Hora de Entrada: " + getHoraEntrada().getHour() + ":" +getHoraEntrada().getMinute() + ":" + getHoraEntrada().getSecond());

        if (saida == true){
            System.out.println("Hora de Saída: " + getHoraSaida().getHour() + ":" + getHoraSaida().getMinute() + ":" + getHoraSaida().getSecond());
        }

        System.out.println("========================================================================");
    }
}
