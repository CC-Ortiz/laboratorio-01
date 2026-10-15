import java.util.Scanner;


public class BilleteraConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titular = leerLinea(scanner, "Nombre del titular: ");
        while (titular.isEmpty()) {
            titular = leerLinea(scanner, "El nombre es obligatorio. Intenta nuevamente: ");
        }

        double saldo = 0;
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1 -> saldo = registrarIngreso(scanner, saldo);
                case 2 -> saldo = registrarGasto(scanner, saldo);
                case 3 -> mostrarSaldo(saldo);
                case 4 -> mostrarResumen(titular, saldo);
                case 0 -> System.out.println("Programa finalizado.");
                case -1 -> System.out.println("Debes ingresar una opción numérica.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("       MI BILLETERA");
        System.out.println("=========================");
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
    }


    static double registrarIngreso(Scanner scanner, double saldo) {
        double valor = leerMonto(scanner, "Valor del ingreso: ");

        if (Double.isNaN(valor)) {
            System.out.println("Debes escribir un monto numérico.");
            return saldo;
        }
        if (!Double.isFinite(valor) || valor <= 0) {
            System.out.println("El ingreso debe ser mayor que cero.");
            return saldo;
        }

        double nuevoSaldo = saldo + valor;
        System.out.println("Ingreso registrado.");
        return nuevoSaldo;
    }


    static double registrarGasto(Scanner scanner, double saldo) {
        double valor = leerMonto(scanner, "Valor del gasto: ");

        if (Double.isNaN(valor)) {
            System.out.println("Debes escribir un monto numérico.");
            return saldo;
        }
        if (!Double.isFinite(valor) || valor <= 0) {
            System.out.println("El gasto debe ser mayor que cero.");
            return saldo;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return saldo;
        }

        double nuevoSaldo = saldo - valor;
        System.out.println("Gasto registrado.");
        return nuevoSaldo;
    }

    static void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: $" + formato(saldo));
    }

    static void mostrarResumen(String titular, double saldo) {
        System.out.println();
        System.out.println("=========================");
        System.out.println("         RESUMEN");
        System.out.println("=========================");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + formato(saldo));
    }



    static String leerLinea(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        if (!scanner.hasNextLine()) {
            System.out.println();
            System.out.println("Entrada finalizada. Programa terminado.");
            System.exit(0);
        }
        return scanner.nextLine().trim();
    }


    static int leerOpcion(Scanner scanner) {
        String entrada = leerLinea(scanner, "Opción: ");
        try {
            int opcion = Integer.parseInt(entrada);
            return opcion < 0 ? 99 : opcion;
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    static double leerMonto(Scanner scanner, String mensaje) {
        String entrada = leerLinea(scanner, mensaje);
        try {
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }


    static String formato(double valor) {
        String texto = java.math.BigDecimal.valueOf(valor).toPlainString();
        return texto.contains(".") ? texto : texto + ".0";
    }
}
