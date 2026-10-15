/**
 * Representa una billetera: conserva su propio estado y aplica sus reglas.
 * No usa Scanner ni imprime menús; esa responsabilidad es de Main.
 */
public class Billetera {

    private String titular;
    private double saldo;
    private int cantidadIngresos;
    private double totalIngresos;
    private int cantidadGastos;
    private double totalGastos;

    public Billetera(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("El titular es obligatorio.");
        }
        this.titular = titular.trim();
        this.saldo = 0;
        this.cantidadIngresos = 0;
        this.totalIngresos = 0;
        this.cantidadGastos = 0;
        this.totalGastos = 0;
    }

    // ---------------- Consultas ----------------

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCantidadIngresos() {
        return cantidadIngresos;
    }

    public int getCantidadGastos() {
        return cantidadGastos;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    // ---------------- Operaciones ----------------

    /** Devuelve true si el ingreso se registró; false si se rechazó (sin cambiar nada). */
    public boolean registrarIngreso(double valor) {
        if (!esMontoValido(valor)) {
            return false;
        }

        saldo += valor;
        cantidadIngresos++;
        totalIngresos += valor;
        return true;
    }

    /** Devuelve true si el gasto se registró; false si se rechazó (sin cambiar nada). */
    public boolean registrarGasto(double valor) {
        if (!esMontoValido(valor) || valor > saldo) {
            return false;
        }

        saldo -= valor;
        cantidadGastos++;
        totalGastos += valor;
        return true;
    }

    /** Un monto válido es finito (ni NaN ni Infinity) y mayor que cero. */
    private boolean esMontoValido(double valor) {
        return Double.isFinite(valor) && valor > 0;
    }
}
