public class ClasificarNota {

    public static void main(String[] args) {
        double[] notas = {4.8, 4.2, 3.5, 2.7};

        for (double nota : notas) {
            System.out.print(nota + " -> ");
            if (nota >= 4.5) {
                System.out.println("Desempeño sobresaliente");
            } else if (nota >= 4.0) {
                System.out.println("Desempeño alto");
            } else if (nota >= 3.0) {
                System.out.println("Desempeño aprobatorio");
            } else {
                System.out.println("No aprobado");
            }
        }

    }
}
