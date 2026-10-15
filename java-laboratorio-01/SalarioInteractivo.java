import java.util.Scanner;

public class SalarioInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del trabajador: ");
        String trabajador = scanner.nextLine();

        System.out.print("Horas trabajadas: ");
        int horas = scanner.nextInt();

        System.out.print("Valor por hora: ");
        double valorHora = scanner.nextDouble();

        double pagoTotal = horas * valorHora;

        System.out.println("-------------------------");
        System.out.println("RESUMEN DE PAGO");
        System.out.println("-------------------------");
        System.out.println("Trabajador: " + trabajador);
        System.out.println("Horas: " + horas);
        System.out.println("Valor por hora: $" + valorHora);
        System.out.println("Pago total: $" + pagoTotal);

        scanner.close();
    }
}
