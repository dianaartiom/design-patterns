import Interfaces.Phone;

/**
 * Created by diana on 7/26/16.
 */
public class Samsung implements Phone {
    @Override
    public void ring() {
        System.out.println("SAMSUNG here.");
    }
}
