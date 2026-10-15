public class MainLibro {

    public static void main(String[] args) {
        Libro uno = new Libro();
        uno.titulo = "Cien años de soledad";
        uno.autor = "Gabriel García Márquez";
        uno.paginas = 471;

        Libro dos = new Libro();
        dos.titulo = "El coronel no tiene quien le escriba";
        dos.autor = "Gabriel García Márquez";
        dos.paginas = 109;

        uno.mostrarFicha();
        System.out.println();
        dos.mostrarFicha();
    }
}
