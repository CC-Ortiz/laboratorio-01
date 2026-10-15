public class CalculoSalario {

    public static void main(String[] args) {
        final double APORTE = 0.04;

        String trabajador = "Sara";
        int horas = 36;
        double valorHora = 20000.0;

        double pago = horas * valorHora;
        double valorAporte = pago * APORTE;

        System.out.println("Trabajador: " + trabajador);
        System.out.println("Horas: " + horas);
        System.out.println("Valor por hora: $" + valorHora);
        System.out.println("Pago total: $" + pago);
        System.out.println("Aporte (4 %): $" + valorAporte);
    }
}
