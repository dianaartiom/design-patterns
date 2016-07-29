/**
 * Created by diana on 7/29/16.
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println(" ");

        System.out.println("Let s see what happens when changing to 15: ");
        System.out.println(" ");
        subject.setState(15);
        subject.notifyAllObservers();

        System.out.println("\n\n");

        System.out.println("Change to be 10: ");
        System.out.println(" ");
        subject.setState(10);
        subject.notifyAllObservers();

    }
}
