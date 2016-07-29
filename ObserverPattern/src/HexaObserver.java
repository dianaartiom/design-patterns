/**
 * Created by diana on 7/29/16.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa string " + Integer.toHexString(subject.getState()));
    }
}