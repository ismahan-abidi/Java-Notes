package access_modifiers_test;

import access_modifiers.*;

import java.sql.SQLOutput;

public class C extends A {
public void f(){

    /**
     si la classe parent et la classe fils existent dans des packages differents, alors  les membres
     public   seraient  accessibles par heritage et par objet , alors que les membre protected ne seraient visibles que par heritage
     */
    // ACCESSIBILITE PAR HERITAGE
    System.out.println(i);
    System.out.println(j);
    // ACCESSIBILITE PAR OBJET
    A a = new A();
    System.out.println(a.i);
   // System.out.println(a.j); !!!! erreur

}



}
