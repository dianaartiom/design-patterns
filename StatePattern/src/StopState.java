/**
 * Created by diana on 7/29/16.
 */
public class StopState implements State {

    @Override
    public void doAction() {
        System.out.println("In the STOP STATE");
    }

    @Override
    public String toString() {
        return "Stop state";
    }
}
