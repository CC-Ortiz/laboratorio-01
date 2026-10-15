import java.util.Scanner;

public class EntradaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Edad: " + edad + " | Cantidad: " + cantidad + " | Precio: $" + precio);

        scanner.close();
    }
}
