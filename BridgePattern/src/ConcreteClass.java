/**
 * Created by diana on 7/27/16.
 */
public class ConcreteClass extends RemoteControl {

    private int currentChannel;

    public void nextChannel() {
        this.currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        this.currentChannel--;
        setChannel(currentChannel);
    }


}
