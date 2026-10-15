public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.nombre = "Teclado";
        producto.precio = 85000;
        producto.cantidad = 3;

        Producto segundo = new Producto();
        segundo.nombre = "Mouse";
        segundo.precio = 45000;
        segundo.cantidad = 7;

        producto.mostrarDetalle();
        segundo.mostrarDetalle();

        System.out.println("Subtotal primero: $" + producto.calcularSubtotal());
        System.out.println("Subtotal segundo: $" + segundo.calcularSubtotal());

        Producto tercero = new Producto();
        tercero.nombre = "Monitor";
        tercero.precio = 720000;
        tercero.cantidad = 2;

        System.out.println("--- Catálogo ---");
        tercero.mostrarDetalle();
        double total = producto.calcularSubtotal() + segundo.calcularSubtotal()
                + tercero.calcularSubtotal();
        System.out.println("Total de los tres subtotales: $" + total);

        segundo.cantidad = 1;
        System.out.println("producto.cantidad = " + producto.cantidad
                + " | segundo.cantidad = " + segundo.cantidad);

        Producto nulo = null;
        try {
            nulo.mostrarDetalle();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: la referencia no apunta a ningún objeto.");
        }
    }
}
