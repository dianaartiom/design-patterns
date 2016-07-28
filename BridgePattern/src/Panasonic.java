/**
 * Created by diana on 7/27/16.
 */
public class Panasonic implements TV{

    @Override
    public void off() {
        System.out.println("The Panasonic TV is off.");
    }

    @Override
    public void on() {
        System.out.println("The Panasonic TV is on.");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("The Panasonic TV switched to " + String.valueOf(channel) + " channel.");
    }
}
