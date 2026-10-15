public class ValidacionUsuario {

    public static void main(String[] args) {
        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        System.out.println("equals: " + usuarioRegistrado.equals(usuarioIngresado));
        System.out.println("equalsIgnoreCase: " + usuarioRegistrado.equalsIgnoreCase(usuarioIngresado));

        String ciudad = "Bogotá";
        System.out.println(ciudad.equals("Bogotá"));
        System.out.println(ciudad.equals("Medellín"));
        System.out.println(ciudad.equalsIgnoreCase("bogotá"));
    }
}
