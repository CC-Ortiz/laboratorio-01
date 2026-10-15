public class CompararCantidades {

    public static void main(String[] args) {
        int inventario = 12;
        int cantidadSolicitada = 8;

        boolean hayInventarioSuficiente = inventario >= cantidadSolicitada;
        boolean esIgualAlInventario = cantidadSolicitada == inventario;
        boolean superaInventario = cantidadSolicitada > inventario;

        System.out.println("¿Inventario suficiente? " + hayInventarioSuficiente);
        System.out.println("¿Igual al inventario? " + esIgualAlInventario);
        System.out.println("¿Supera el inventario? " + superaInventario);
    }
}
