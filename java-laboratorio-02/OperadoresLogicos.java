public class OperadoresLogicos {

    public static void main(String[] args) {
        int edad = 21;
        boolean documentoValido = true;
        System.out.println(edad >= 18 && documentoValido);

        boolean tieneCarnet = false;
        boolean tieneAutorizacion = true;
        System.out.println(tieneCarnet || tieneAutorizacion);

        int edad2 = 17;
        boolean acompanado = true;

        boolean resultado1 = edad2 >= 18;
        boolean resultado2 = edad2 >= 18 || acompanado;
        boolean resultado3 = edad2 >= 18 && acompanado;
        boolean resultado4 = !acompanado;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    }
}
