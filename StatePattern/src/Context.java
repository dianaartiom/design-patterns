/**
 * Created by diana on 7/29/16.
 */
public class Context {

    State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
