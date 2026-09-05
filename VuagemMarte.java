import java.util.Scanner;

public class ViagemMarte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Distância média entre a Terra e Marte
        double distanciaTerraMarte = 225_000_000;

        // Solicita a velocidade da nave
        System.out.print("Digite a velocidade média da nave (km/h): ");
        double velocidade = scanner.nextDouble();

        // Calcula o tempo de ida
        double tempoIdaHoras = distanciaTerraMarte / velocidade;

        // Calcula o tempo de volta
        double tempoVoltaHoras = distanciaTerraMarte / velocidade;

        // Tempo total da viagem
        double tempoTotalHoras = tempoIdaHoras + tempoVoltaHoras;

        // Conversão para dias
        double tempoTotalDias = tempoTotalHoras / 24;

        // Conversão para meses (aproximadamente)
        double tempoTotalMeses = tempoTotalDias / 30;

        System.out.println("\n===== VIAGEM TERRA → MARTE → TERRA =====");

        System.out.printf("Distância de ida: %.0f km%n", distanciaTerraMarte);
        System.out.printf("Velocidade da nave: %.0f km/h%n", velocidade);

        System.out.printf("Tempo de ida: %.2f horas%n", tempoIdaHoras);
        System.out.printf("Tempo de volta: %.2f horas%n", tempoVoltaHoras);

        System.out.printf("Tempo total: %.2f horas%n", tempoTotalHoras);
        System.out.printf("Tempo total: %.2f dias%n", tempoTotalDias);
        System.out.printf("Tempo total: %.2f meses%n", tempoTotalMeses);

        scanner.close();
    }
}