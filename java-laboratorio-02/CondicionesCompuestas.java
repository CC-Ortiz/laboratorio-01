public class CondicionesCompuestas {

    public static void main(String[] args) {
        boolean[] membresias = {true, true, false, false};
        double[] totales = {250000, 150000, 250000, 150000};

        for (int i = 0; i < membresias.length; i++) {
            if (membresias[i] && totales[i] >= 200000) {
                System.out.println("Membresía " + membresias[i] + ", compra " + totales[i] + " -> Aplica beneficio.");
            } else {
                System.out.println("Membresía " + membresias[i] + ", compra " + totales[i] + " -> No aplica beneficio.");
            }
        }

        int edad = 20;
        boolean tieneDocumento = true;

        if (edad >= 18) {
            if (tieneDocumento) {
                System.out.println("Ingreso autorizado.");
            } else {
                System.out.println("Debe presentar documento.");
            }
        } else {
            System.out.println("No cumple la edad requerida.");
        }

        if (edad >= 18 && tieneDocumento) {
            System.out.println("Ingreso autorizado (versión con &&).");
        } else if (edad >= 18) {
            System.out.println("Debe presentar documento.");
        } else {
            System.out.println("No cumple la edad requerida.");
        }
    }
}
