import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer valor: ");
        double a = scanner.nextDouble();
        System.out.print("Segundo valor: ");
        double b = scanner.nextDouble();

        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.println("Resta: " + calc.restar(a, b));
        System.out.println("Multiplicación: " + calc.multiplicar(a, b));

        scanner.close();
    }
}
