public class FacturaSimple {

    public static void main(String[] args) {
        final double IMPUESTO = 0.19;

        String producto = "Monitor";
        double precioUnitario = 100000;
        int cantidad = 2;
        double porcentajeDescuento = 0.10;

        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * porcentajeDescuento;
        double total = subtotal - valorDescuento;

        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Total: $" + total);

        double base = total;
        double valorImpuesto = base * IMPUESTO;
        double totalFinal = base + valorImpuesto;

        System.out.println("--- Con impuesto ---");
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + valorImpuesto);
        System.out.println("Total final: $" + totalFinal);
    }
}
