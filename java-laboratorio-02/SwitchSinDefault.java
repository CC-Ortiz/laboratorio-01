public class SwitchSinDefault {

    public static void main(String[] args) {
        int opcion = 9;

        switch (opcion) {
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Dos");
            case 3 -> System.out.println("Tres");
            default -> System.out.println("Opción no válida.");
        }

        String comando = "guardar";
        switch (comando) {
            case "guardar" -> System.out.println("Guardando...");
            case "buscar" -> System.out.println("Buscando...");
            case "salir" -> System.out.println("Saliendo...");
            default -> System.out.println("Comando desconocido.");
        }
    }
}
