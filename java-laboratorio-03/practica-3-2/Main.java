public class Main {

    public static void main(String[] args) {
        Producto primero = new Producto("Teclado", 85000, 3);
        Producto segundo = new Producto("Mouse", 45000, 7);

        primero.mostrarDetalle();
        System.out.println("Subtotal: $" + primero.calcularSubtotal());

        segundo.mostrarDetalle();
        System.out.println("Subtotal: $" + segundo.calcularSubtotal());

        Contador visitas = new Contador();
        visitas.aumentar();
        visitas.aumentar();
        visitas.mostrar();

        Contador otro = new Contador();
        otro.mostrar();

        Termometro t0 = new Termometro(0);
        Termometro t25 = new Termometro(25);
        System.out.println(t0.mostrarCelsius() + " -> " + t0.convertirAFahrenheit() + " °F");
        System.out.println(t25.mostrarCelsius() + " -> " + t25.convertirAFahrenheit() + " °F");

        Estudiante e1 = new Estudiante("Laura", 2561234, 5, 2.8);
        Estudiante e2 = new Estudiante("Diego", 2561235, 3, 4.1);
        e1.mostrarPerfil();
        System.out.println("¿Aprobó? " + e1.aprobo());
        e2.mostrarPerfil();
        System.out.println("¿Aprobó? " + e2.aprobo());
    }
}
