/**
 * Created by diana on 7/27/16.
 */
public class Sony implements TV {

//    private boolean tvState;

    @Override
    public void off() {
        System.out.println("The Sony TV is off.");
    }

    @Override
    public void on() {
        System.out.println("The Sony TV is on.");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("The Sony TV switched to " + String.valueOf(channel) + " channel.");
    }
}
