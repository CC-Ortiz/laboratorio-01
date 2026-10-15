public class ValidarEdad {

    public static void main(String[] args) {
        int[] edades = {17, 18, 25};

        for (int edad : edades) {
            if (edad >= 18) {
                System.out.println(edad + ": Es mayor de edad.");
            } else {
                System.out.println(edad + ": Es menor de edad.");
            }
        }
    }
}
