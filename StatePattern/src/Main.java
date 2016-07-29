/**
 * Created by diana on 7/29/16.
 */
public class Main {

    public static void main(String[] args) {

        Context context = new Context();

        State startState = new StartState();
        State endState = new StopState();

        startState.doAction();
        context.setState(startState);
        System.out.println(context.getState().toString());

        endState.doAction();
        context.setState(endState);
        System.out.println(context.getState().toString());
    }
}
