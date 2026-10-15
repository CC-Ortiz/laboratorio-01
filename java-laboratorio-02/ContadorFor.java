public class ContadorFor {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            System.out.println(numero);
        }

        for (int numero = 10; numero >= 1; numero--) {
            System.out.println(numero);
        }

        int suma = 0;
        for (int numero = 1; numero <= 5; numero++) {
            suma = suma + numero;
        }
        System.out.println("Suma: " + suma);
    }
}
