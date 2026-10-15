public class Main {

    public static void main(String[] args) {
        Billetera billetera = new Billetera("Laura");

        boolean primera = billetera.registrarIngreso(100000);
        boolean segunda = billetera.registrarIngreso(-5000);

        System.out.println("Primer ingreso: " + primera);
        System.out.println("Segundo ingreso: " + segunda);
        System.out.println("Saldo: $" + billetera.getSaldo());

        System.out.println("Gasto 30000: " + billetera.registrarGasto(30000));
        System.out.println("Gasto 90000: " + billetera.registrarGasto(90000));
        System.out.println("Cantidad de ingresos: " + billetera.getCantidadIngresos());
        System.out.println("Cantidad de gastos: " + billetera.getCantidadGastos());
        System.out.println("Saldo: $" + billetera.getSaldo());

        Billetera laura = new Billetera("Laura");
        Billetera diego = new Billetera("Diego");
        laura.registrarIngreso(150000);
        diego.registrarIngreso(70000);
        laura.registrarGasto(25000);
        System.out.println(laura.getSaldo());
        System.out.println(diego.getSaldo());

    }
}
