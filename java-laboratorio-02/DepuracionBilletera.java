public class DepuracionBilletera {

    public static void main(String[] args) {
        double saldo = 0;
        saldo = ingreso(saldo, 100000);
        saldo = gasto(saldo, 30000);
        saldo = gasto(saldo, 90000);
        System.out.println("Saldo final: $" + saldo);
    }

    static double ingreso(double saldo, double valor) {
        if (valor <= 0) {
            return saldo;
        }
        return saldo + valor;
    }

    static double gasto(double saldo, double valor) {
        if (valor <= 0 || valor > saldo) {
            return saldo;
        }
        return saldo - valor;
    }
}
