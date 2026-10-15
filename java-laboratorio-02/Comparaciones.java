public class Comparaciones {

    public static void main(String[] args) {
        int edad = 20;

        System.out.println(edad > 18);
        System.out.println(edad < 18);
        System.out.println(edad >= 20);
        System.out.println(edad == 20);
        System.out.println(edad != 20);

        double nota = 3.8;
        boolean aprobo = nota >= 3.0;
        System.out.println(aprobo);

        double saldo = 120000;
        double compra = 150000;
        boolean puedeComprar = saldo >= compra;
        System.out.println(puedeComprar);
        saldo = 200000;
        puedeComprar = saldo >= compra;
        System.out.println(puedeComprar);
    }
}
