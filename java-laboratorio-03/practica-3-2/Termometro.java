public class Termometro {

    double temperaturaCelsius;

    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    String mostrarCelsius() {
        return (int) temperaturaCelsius + " °C";
    }

    double convertirAFahrenheit() {
        return (temperaturaCelsius * 9 / 5) + 32;
    }
}
