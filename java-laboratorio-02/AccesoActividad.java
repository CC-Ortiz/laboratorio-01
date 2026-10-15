public class AccesoActividad {

    public static void main(String[] args) {
        int edad = 19;
        boolean inscripcionActiva = true;
        boolean documentoPresentado = false;

        boolean mayorEdad = edad >= 18;
        boolean inscripcionYDocumento = inscripcionActiva && documentoPresentado;
        boolean cumpleTodo = mayorEdad && inscripcionActiva && documentoPresentado;

        System.out.println("Mayor de edad: " + mayorEdad);
        System.out.println("Inscripción y documento: " + inscripcionYDocumento);
        System.out.println("Cumple los tres requisitos: " + cumpleTodo);
    }
}
