import Interfaces.Phone;
import Interfaces.Watch;

/**
 * Created by diana on 7/26/16.
 */
public class WatchFactory extends AbstractFactory {

    @Override
    Watch getWatch(String watchModel) {
        switch (watchModel) {
            case "ROLLEX":
                return new Rollex();
            case "ANDROIDWATCH":
                return new AndroidWatch();
            default:
                return null;
        }
    }

    @Override
    Phone getPhone(String phoneModel) {
        return null;
    }
}
