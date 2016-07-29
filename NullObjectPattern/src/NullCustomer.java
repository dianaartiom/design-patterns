/**
 * Created by diana on 7/29/16.
 */
public class NullCustomer extends  AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNill() {
        return true;
    }
}
