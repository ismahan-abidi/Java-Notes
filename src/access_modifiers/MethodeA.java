package access_modifiers;

public class MethodeA {
    public String f() {
        return "je suis une méthode publique";
    }
    protected String g(){
    return  "je suis une méthode protected";
    }
    String  h(){
        return  "je suis une methode par default";
    }
    private String  k(){
        return "je suis une methode private";
    }
}
