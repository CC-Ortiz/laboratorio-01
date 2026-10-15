public class DepuracionCotizador {

    public static void main(String[] args) {
        double precio = 180000.5;
        int cantidad = 2;
        int porcentaje = 10;

        double subtotal = precio * cantidad;

        double descuentoMal = subtotal * (porcentaje / 100);
        double descuentoBien = subtotal * (porcentaje / 100.0);

        System.out.println("Descuento incorrecto: " + descuentoMal);
        System.out.println("Descuento correcto: " + descuentoBien);
    }
}
