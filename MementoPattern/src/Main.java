/**
 * Created by diana on 7/29/16.
 */
public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current originator state: " + originator.getState() + "\n");

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First state saved in memento: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second state saved in memento: " + originator.getState());
    }
}
