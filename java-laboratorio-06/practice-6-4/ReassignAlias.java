public class ReassignAlias {

    static final class Pet {
        private String name;
        Pet(String name) { this.name = name; }
        String getName() { return name; }
        void rename(String newName) { name = newName; }
    }

    public static void main(String[] args) {
        Pet first = new Pet("Luna");
        Pet alias = first;
        Pet independent = new Pet("Luna");
        Pet third = first;

        alias.rename("Sol");
        System.out.println("third (antes de reasignar alias): " + third.getName());

        alias = new Pet("Nova");
        alias.rename("Max");

        System.out.println("first: " + first.getName());
        System.out.println("third: " + third.getName());
        System.out.println("independent: " + independent.getName());
        System.out.println("alias: " + alias.getName());
    }
}
