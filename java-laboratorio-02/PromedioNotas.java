import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de notas: ");
        int cantidad = scanner.nextInt();

        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nota " + i + ": ");
            suma += scanner.nextDouble();
        }

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / cantidad));
        } else {
            System.out.println("No hay notas para promediar.");
        }

        scanner.close();
    }
}
