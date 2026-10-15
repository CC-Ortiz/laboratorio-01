public class PerfilAprendiz {

    public static void main(String[] args) {
        String nombre = "Laura Gómez";
        int edad = 22;
        int trimestre = 5;
        double promedio = 4.3;
        boolean activo = true;

        System.out.println("-------------------------");
        System.out.println("   PERFIL DE APRENDIZ");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Trimestre: " + trimestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);

        trimestre = 6;
        promedio = 4.5;

        System.out.println("--- Tras actualizar ---");
        System.out.println("Trimestre: " + trimestre);
        System.out.println("Promedio: " + promedio);
    }
}
