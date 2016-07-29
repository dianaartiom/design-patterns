/**
 * Created by diana on 7/29/16.
 */
public class Main {

    public static void main(String[] args) {

        User sasha = new User("Sasha");
        sasha.sendMessage("Privet, Misha!");

        User misha = new User("Misha");
        misha.sendMessage("Privet, Sasha!");

    }
}
