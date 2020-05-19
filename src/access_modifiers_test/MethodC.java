package access_modifiers_test;

import access_modifiers.MethodeA;

public class MethodC  extends MethodeA {
    public void ff(){
        // ACCESSIBILITE PAR HERITAGE  :
        System.out.println(f());
        System.out.println(g());
        // ACCESSIBILITE PAR OBJET:
        MethodeA ma1 = new MethodeA();
        System.out.println(ma1.f());
        // System.out.println(ma1.g()); protected accessible seulement par heritage

    }
}
