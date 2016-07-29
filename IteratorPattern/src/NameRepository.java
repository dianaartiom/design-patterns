import java.util.List;

/**
 * Created by diana on 7/29/16.
 */
public class NameRepository implements Container {

    public String names[] = {"Jora", "Sasha", "Misa", "Tolea"};

    @Override
    public Object getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object getNext() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
