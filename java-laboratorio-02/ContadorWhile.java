import java.util.Scanner;

public class ContadorWhile {

    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Número (0 para terminar): ");
        int valor = scanner.nextInt();

        while (valor != 0) {
            System.out.println("Escribiste: " + valor);
            System.out.print("Número (0 para terminar): ");
            valor = scanner.nextInt();
        }

        System.out.println("Fin.");
        scanner.close();
    }
}
