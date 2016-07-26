/**
 * Created by diana on 7/26/16.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "WATCH":
                return new WatchFactory();
            case "PHONE":
                return new PhoneFactory();
            default:
                return null;
        }
    }
}
