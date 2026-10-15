import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Cursos terminados: ");
        int cursos = scanner.nextInt();

        System.out.println("-------------------------");
        System.out.println("      FICHA DE USUARIO");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad: " + edad);
        System.out.println("Cursos terminados: " + cursos);

        scanner.close();
    }
}
