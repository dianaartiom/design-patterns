/**
 * Created by diana on 7/27/16.
 */
public abstract class RemoteControl {

    private TV implementor;

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void setChannel(int channel) {

        if (implementor != null) {
            implementor.tuneChannel(channel);
        }
    }
}
