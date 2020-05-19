package access_modifiers;

public class B extends A {
    public void f(){ // on ne peut faire des instructions que dans une méthode
        /**
         si la classe parent et la classe fils coexistent dans le meme package alors tout les membres
         public , protected et default sont accessibles par heritage et par objet
         */
        // ACCESSIBILITE PAR HERITAGE  :
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        //ACCESSIBILITE PAR OBJET
        A a = new A();
        System.out.println(a.i);
        System.out.println(a.j);
        System.out.println(a.k);
    }
}
