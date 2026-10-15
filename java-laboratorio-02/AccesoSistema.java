import java.util.Scanner;

public class AccesoSistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String claveCorrecta = "java21";

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String clave = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Credenciales correctas.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }

        scanner.close();
    }
}
