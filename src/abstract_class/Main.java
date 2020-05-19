package abstract_class;


public class Main {
    public static void main(String[] args) {
        Vache vache = new Vache();
        Lion lion = new Lion();
        Chat chat = new Chat();
        vache.manger();
        lion.manger();
        chat.manger();
        AnimalUtil.f(lion);
        AnimalUtil.f(vache);
        AnimalUtil.f(chat);

    }
}
