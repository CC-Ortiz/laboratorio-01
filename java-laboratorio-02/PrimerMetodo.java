public class PrimerMetodo {

    public static void main(String[] args) {
        mostrarTitulo();
        mostrarTitulo();

        saludar("Laura");
        saludar("Andrés");

        mostrarProducto("Teclado", 85000);
        mostrarProducto("Mouse", 45000);
        mostrarProducto("Monitor", 720000);

        double total = calcularTotal(85000, 3);
        System.out.println("Total: $" + total);

        double subtotal = 200000;
        double descuento = calcularDescuento(subtotal, 0.10);
        System.out.println(descuento);

    }

    static void mostrarTitulo() {
        System.out.println("====================");
        System.out.println("     APLICACIÓN");
        System.out.println("====================");
    }

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    static void mostrarProducto(String nombre, double precio) {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }

    static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularDescuento(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }
}
