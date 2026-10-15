import java.util.Scanner;

public class ConversorMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR");
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Kilómetros: ");
                double km = scanner.nextDouble();
                System.out.println(km + " km = " + (km * 1000) + " m");
            }
            case 2 -> {
                System.out.print("Metros: ");
                double m = scanner.nextDouble();
                System.out.println(m + " m = " + (m * 100) + " cm");
            }
            case 3 -> {
                System.out.print("Celsius: ");
                double c = scanner.nextDouble();
                System.out.println(c + " °C = " + (c * 9 / 5 + 32) + " °F");
            }
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
