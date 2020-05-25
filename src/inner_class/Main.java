package inner_class;

import access_modifiers_test.C;

public class Main {
    public static void main(String[] args) {
        // instanciation d'un static inner class
        ClassPrincipal.StaticInnerClass objetstatic = new ClassPrincipal.StaticInnerClass();
        // instanciation d'un  non static inner class
        ClassPrincipal objet = new ClassPrincipal();
        ClassPrincipal.NonStaticInnerClass objetNonStatic = objet.new NonStaticInnerClass();


    }
}
