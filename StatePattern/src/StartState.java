/**
 * Created by diana on 7/29/16.
 */
public class StartState implements State {

    @Override
    public void doAction() {
        System.out.println("In the START STATE");
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
