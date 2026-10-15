public class CuentaPuntos {

    private String titular;
    private int puntos;

    public CuentaPuntos(String titular) {
        this.titular = titular;
        this.puntos = 0;
    }

    public int consultarPuntos() {
        return puntos;
    }

    public boolean sumarPuntos(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        puntos += cantidad;
        return true;
    }

    public boolean canjearPuntos(int cantidad) {
        if (cantidad <= 0 || cantidad > puntos) {
            return false;
        }
        puntos -= cantidad;
        return true;
    }

    public static void main(String[] args) {
        CuentaPuntos cuenta = new CuentaPuntos("Ana");
        System.out.println("Puntos iniciales: " + cuenta.consultarPuntos());
        System.out.println("Sumar 80: " + (cuenta.sumarPuntos(80) ? "aceptado" : "rechazado"));
        System.out.println("Canjear 30: " + (cuenta.canjearPuntos(30) ? "aceptado" : "rechazado"));
        System.out.println("Canjear 100: " + (cuenta.canjearPuntos(100) ? "aceptado" : "rechazado"));
        System.out.println("Puntos finales: " + cuenta.consultarPuntos());
    }
}
