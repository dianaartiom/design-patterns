import java.util.ArrayList;
import java.util.List;

/**
 * Created by diana on 7/29/16.
 */
public class Subject {

    List<Observer> observers = new ArrayList<Observer>();
    int state;

    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer o :
                observers) {
            o.update();
        }
    }
}
