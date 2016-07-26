import Interfaces.Phone;
import Interfaces.Watch;

/**
 * Created by diana on 7/26/16.
 */
public class Main {
    public static void main(String[] args) {

        AbstractFactory watchFactory = FactoryProducer.getFactory("WATCH");
        AbstractFactory phoneFactory = FactoryProducer.getFactory("PHONE");

        Phone iphone = phoneFactory.getPhone("IPHONE");
        Phone samsung = phoneFactory.getPhone("SAMSUNG");

        iphone.ring();
        samsung.ring();

        Watch watch1 = watchFactory.getWatch("ROLLEX");
        Watch watch2 = watchFactory.getWatch("ANDROIDWATCH");

        watch1.getHour();
        watch2.getHour();
    }
}
