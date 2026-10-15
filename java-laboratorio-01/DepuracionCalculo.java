public class DepuracionCalculo {

    public static void main(String[] args) {
        int unidades = 4;
        double precio = 25000.0;
        double descuento = 0.20;

        double subtotal = unidades * precio;
        double valorDescuento = subtotal * descuento;
        double total = subtotal - valorDescuento;

        System.out.println(total);
    }
}
