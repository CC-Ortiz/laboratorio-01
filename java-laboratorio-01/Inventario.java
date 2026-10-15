public class Inventario {

    public static void main(String[] args) {
        String producto = "Monitor";
        int unidades = 8;
        double precio = 720000.0;
        boolean disponible = true;

        System.out.println("--- Estado inicial ---");
        System.out.println("Producto: " + producto);
        System.out.println("Unidades: " + unidades);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + disponible);

        unidades = 5;
        precio = 699000.0;

        System.out.println("--- Estado actualizado ---");
        System.out.println("Producto: " + producto);
        System.out.println("Unidades: " + unidades);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + disponible);
    }
}
