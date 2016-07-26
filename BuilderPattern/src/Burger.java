import interfaces.Item;
import interfaces.Packing;

/**
 * Created by diana on 7/26/16.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract Float price();
}
