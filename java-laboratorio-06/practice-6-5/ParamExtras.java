public class ParamExtras {

    static final class Pet {
        String name;
        Pet(String name) { this.name = name; }
    }

    static void changeA(Pet local) {      // Variante A: reasignar antes de modificar
        local = new Pet("Otra");
        local.name = "Sol";
        System.out.println("A Dentro: " + local.name);
    }

    static void changeB(Pet local) {      // Variante B: sin reasignacion
        local.name = "Sol";
        System.out.println("B Dentro: " + local.name);
    }

    static Pet createNew(Pet previous) {  // Variante C: retornar un objeto nuevo
        return new Pet("Nueva");
    }

    static void clearLocalReference(Object value) {
        value = null;
    }

    public static void main(String[] args) {
        Pet p = new Pet("Luna");
        changeA(p);
        System.out.println("A Fuera: " + p.name);

        p = new Pet("Luna");
        changeB(p);
        System.out.println("B Fuera: " + p.name);

        p = new Pet("Luna");
        p = createNew(p);
        System.out.println("C Fuera (tras asignar el retorno): " + p.name);

        Pet original = new Pet("Luna");   // Variante D: alias
        Pet alias = original;
        changeB(original);
        System.out.println("D alias.name: " + alias.name + " | mismo objeto: " + (alias == original));

        Object obj = new Object();
        clearLocalReference(obj);
        System.out.println("obj es null tras la llamada? " + (obj == null));
    }
}
