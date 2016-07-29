import java.util.ArrayList;
import java.util.List;

/**
 * Created by diana on 7/29/16.
 */
public class CareTaker {

    List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
