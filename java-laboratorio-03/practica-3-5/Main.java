import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Reflexión previa (Práctica 3.5, sección 5):
 *
 * 1. ¿Qué datos deben pertenecer a la billetera?
 *    Titular, saldo, cantidad de ingresos, total ingresado, cantidad de gastos
 *    y total gastado. Son su estado y solo ella debe modificarlo.
 *
 * 2. ¿Qué tareas le corresponden solamente al menú (Main)?
 *    Crear el Scanner, pedir el titular y los montos, convertir el texto a número,
 *    mostrar el menú, los mensajes y el resumen. No decide si el saldo cambia.
 *
 * 3. ¿Qué operaciones pueden cambiar el saldo?
 *    Únicamente registrarIngreso() y registrarGasto(), y solo cuando el monto es válido.
 *    No existe setSaldo().
 *
 * 4. ¿Qué información debe poder consultarse desde otra clase?
 *    Titular, saldo, cantidades y totales de ingresos y gastos (métodos get...).
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titular = leerLinea(scanner, "Nombre del titular: ");
        while (titular.isEmpty()) {
            titular = leerLinea(scanner, "El nombre es obligatorio. Intenta nuevamente: ");
        }

        Billetera billetera = new Billetera(titular);
        int opcion;

        do {
            mostrarMenu(billetera);
            opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1 -> {
                    double valor = leerMonto(scanner, "Valor del ingreso: ");
                    if (Double.isNaN(valor)) {
                        System.out.println("Debes escribir un monto numérico.");
                    } else if (billetera.registrarIngreso(valor)) {
                        System.out.println("Ingreso registrado.");
                    } else {
                        System.out.println("El ingreso no fue aceptado: el monto debe ser positivo y finito.");
                    }
                }
                case 2 -> {
                    double valor = leerMonto(scanner, "Valor del gasto: ");
                    if (Double.isNaN(valor)) {
                        System.out.println("Debes escribir un monto numérico.");
                    } else if (billetera.registrarGasto(valor)) {
                        System.out.println("Gasto registrado.");
                    } else if (Double.isFinite(valor) && valor > billetera.getSaldo()) {
                        System.out.println("Saldo insuficiente: el gasto supera el saldo disponible.");
                    } else {
                        System.out.println("El gasto no fue aceptado: el monto debe ser positivo y finito.");
                    }
                }
                case 3 -> System.out.println("Saldo actual: $" + formato(billetera.getSaldo()));
                case 4 -> mostrarResumen(billetera);
                case 0 -> System.out.println("Programa finalizado.");
                case -1 -> System.out.println("Debes ingresar una opción numérica.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    static void mostrarMenu(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("        MI BILLETERA JAVA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo disponible: $" + formato(billetera.getSaldo()));
        System.out.println();
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
        System.out.println();
    }

    static void mostrarResumen(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("        RESUMEN DE BILLETERA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo actual: $" + formato(billetera.getSaldo()));
        System.out.println("Ingresos realizados: " + billetera.getCantidadIngresos());
        System.out.println("Total ingresado: $" + formato(billetera.getTotalIngresos()));
        System.out.println("Gastos realizados: " + billetera.getCantidadGastos());
        System.out.println("Total gastado: $" + formato(billetera.getTotalGastos()));
    }

    // ---------------- Lectura segura (solo nextLine) ----------------

    static String leerLinea(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        if (!scanner.hasNextLine()) {
            System.out.println();
            System.out.println("Entrada finalizada. Programa terminado.");
            System.exit(0);
        }
        return scanner.nextLine().trim();
    }

    /** Devuelve la opción, -1 si no es un entero, 99 si es negativa. */
    static int leerOpcion(Scanner scanner) {
        String entrada = leerLinea(scanner, "Seleccione una opción: ");
        try {
            int opcion = Integer.parseInt(entrada);
            return opcion < 0 ? 99 : opcion;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /** Devuelve el monto escrito, o NaN si el texto no es numérico. */
    static double leerMonto(Scanner scanner, String mensaje) {
        String entrada = leerLinea(scanner, mensaje);
        try {
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }

    /** Muestra el número sin notación científica (ej. 1.5E7 -> 15000000.0). */
    static String formato(double valor) {
        String texto = BigDecimal.valueOf(valor).toPlainString();
        return texto.contains(".") ? texto : texto + ".0";
    }
}
