public class ConversionTiempo {

    public static void main(String[] args) {
        int[] totales = {367, 60, 135, 1000};

        for (int totalMinutos : totales) {
            int horas = totalMinutos / 60;
            int minutos = totalMinutos % 60;
            System.out.println(totalMinutos + " min -> Horas: " + horas
                    + " | Minutos restantes: " + minutos);
        }
    }
}
