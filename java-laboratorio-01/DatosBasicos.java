public class DatosBasicos {

    public static void main(String[] args) {
        String producto = "Teclado";
        int cantidad = 3;
        double precio = 85000.0;
        boolean disponible = true;
        char categoria = 'A';

        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + disponible);
        System.out.println("Categoría: " + categoria);

        int unidades = 10;
        System.out.println(unidades);
        unidades = 15;
        System.out.println(unidades);

        final double IVA = 0.19;
        final int MESES_ANIO = 12;
        System.out.println("IVA: " + IVA + " | Meses: " + MESES_ANIO);

    }
}
