import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titular: ");
        String nombre = scanner.nextLine();

        CuentaPuntos cuenta = new CuentaPuntos(nombre);

        System.out.println("Puntos iniciales: " + cuenta.getPuntos());

        for (int i = 1; i <= 2; i++) {
            System.out.print("Puntos a registrar (" + i + "): ");
            int cantidad = scanner.nextInt();

            if (cuenta.sumarPuntos(cantidad)) {
                System.out.println("Operación registrada.");
            } else {
                System.out.println("La cantidad debe ser positiva.");
            }
        }

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Puntos finales: " + cuenta.getPuntos());

        scanner.close();
    }
}
