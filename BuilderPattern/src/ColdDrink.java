import interfaces.Item;
import interfaces.Packing;

/**
 * Created by diana on 7/26/16.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float price() ;
}
