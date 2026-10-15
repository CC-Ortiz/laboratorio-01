import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Valor de la compra: ");
        double compra = scanner.nextDouble();

        int porcentaje;
        if (compra >= 500000) {
            porcentaje = 15;
        } else if (compra >= 250000) {
            porcentaje = 10;
        } else if (compra >= 100000) {
            porcentaje = 5;
        } else {
            porcentaje = 0;
        }

        double descuento = compra * porcentaje / 100.0;
        double total = compra - descuento;

        System.out.println("Cliente: " + cliente);
        System.out.println("Valor original: $" + compra);
        System.out.println("Porcentaje aplicado: " + porcentaje + " %");
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total final: $" + total);

        scanner.close();
    }
}
