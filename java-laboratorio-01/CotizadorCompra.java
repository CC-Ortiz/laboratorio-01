import java.util.Scanner;


public class CotizadorCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("       COTIZADOR JAVA");
        System.out.println("=============================");
        System.out.println();

        
        String cliente = leerTexto(scanner, "Nombre del cliente: ");
        String producto = leerTexto(scanner, "Producto: ");
        double precioUnitario = leerDecimalPositivo(scanner, "Precio unitario: ");
        int cantidad = leerEntero(scanner, "Cantidad: ", 1, Integer.MAX_VALUE);
        int descuentoPorcentaje = leerEntero(scanner, "Descuento (%): ", 0, 100);
        int impuestoPorcentaje = leerEntero(scanner, "Impuesto (%): ", 0, 100);

        
        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * descuentoPorcentaje / 100.0;
        double base = subtotal - valorDescuento;
        double valorImpuesto = base * impuestoPorcentaje / 100.0;
        double total = base + valorImpuesto;

        
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("RESUMEN DE COMPRA");
        System.out.println("-----------------------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + dinero(precioUnitario));
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + dinero(subtotal));
        System.out.println("Descuento: $" + dinero(valorDescuento));
        System.out.println("Base: $" + dinero(base));
        System.out.println("Impuesto: $" + dinero(valorImpuesto));
        System.out.println("TOTAL: $" + dinero(total));

        scanner.close();
    }



    static String leerLinea(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        if (!scanner.hasNextLine()) {
            System.out.println();
            System.out.println("Entrada finalizada antes de completar los datos.");
            System.exit(1);
        }
        return scanner.nextLine().trim();
    }

    static String leerTexto(Scanner scanner, String mensaje) {
        String texto = leerLinea(scanner, mensaje);
        while (texto.isEmpty()) {
            System.out.println("  Este dato es obligatorio.");
            texto = leerLinea(scanner, mensaje);
        }
        return texto;
    }

    static double leerDecimalPositivo(Scanner scanner, String mensaje) {
        while (true) {
            String entrada = leerLinea(scanner, mensaje);
            try {
                double valor = Double.parseDouble(entrada);
                if (Double.isFinite(valor) && valor > 0) {
                    return valor;
                }
                System.out.println("  Debe ser un número positivo.");
            } catch (NumberFormatException e) {
                System.out.println("  Escribe un número válido (usa punto para decimales).");
            }
        }
    }

    static int leerEntero(Scanner scanner, String mensaje, int minimo, int maximo) {
        while (true) {
            String entrada = leerLinea(scanner, mensaje);
            try {
                int valor = Integer.parseInt(entrada);
                if (valor >= minimo && valor <= maximo) {
                    return valor;
                }
                if (maximo == Integer.MAX_VALUE) {
                    System.out.println("  Debe ser un entero mayor o igual a " + minimo + ".");
                } else {
                    System.out.println("  Debe ser un entero entre " + minimo + " y " + maximo + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("  Escribe un número entero válido.");
            }
        }
    }

    /** Muestra un valor con decimales sin usar notación científica (ej. 1.5E7). */
    static String dinero(double valor) {
        String texto = java.math.BigDecimal.valueOf(valor).toPlainString();
        return texto.contains(".") ? texto : texto + ".0";
    }
}
