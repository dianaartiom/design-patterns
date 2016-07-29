/**
 * Created by diana on 7/29/16.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string: " + Integer.toOctalString(subject.getState()));
    }
}
