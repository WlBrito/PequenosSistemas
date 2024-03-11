package entity;
import java.util.Scanner;

public class Reserva {
    private String nomeReserva;
    private int numPessoas;
    private String dataHora;

    public String getNomeReserva() {
        return nomeReserva;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }
    

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome da reserva:");
        this.nomeReserva = scanner.nextLine();
        System.out.println("Número de pessoas:");
        this.numPessoas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Data e hora (dd/MM/yyyy HH:mm):");
        this.dataHora = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nomeReserva='" + nomeReserva + '\'' +
                ", numPessoas=" + numPessoas +
                ", dataHora='" + dataHora + '\'' +
                '}';
    }
}
