import java.util.Scanner;

public class SumaInteractiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer número: ");
        int a = scanner.nextInt();
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo: " + (a % b));

        scanner.close();
    }
}
