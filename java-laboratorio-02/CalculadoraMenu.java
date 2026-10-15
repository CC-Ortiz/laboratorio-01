import java.util.Scanner;

public class CalculadoraMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (a + b));
            case 2 -> System.out.println("Resultado: " + (a - b));
            case 3 -> System.out.println("Resultado: " + (a * b));
            case 4 -> {
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
            }
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
