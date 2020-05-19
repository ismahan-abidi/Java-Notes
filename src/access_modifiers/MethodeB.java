package access_modifiers;

public class MethodeB extends MethodeA{
    public void ff(){
        // ACCESSIBILITE PAR HERITAGE  :
        // System.out.println(f()); Cannot resolve method 'println(void)'
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
        // ACCESSIBILITE PAR OBJET  :
        MethodeA ma = new MethodeA();
        System.out.println(ma.f());
        System.out.println(ma.g());
        System.out.println(ma.h());


    }
}
