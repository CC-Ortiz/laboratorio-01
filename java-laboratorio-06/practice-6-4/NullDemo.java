public class NullDemo {

    static final class Pet {
        private final String name;
        Pet(String name) { this.name = name; }
        String getName() { return name; }
    }

    public static void main(String[] args) {
        Pet missing = null;
        if (missing != null) {
            System.out.println(missing.getName());
        } else {
            System.out.println("Version corregida: missing es null, no se accede");
        }
        System.out.println(missing.getName()); // provoca NullPointerException
    }
}
