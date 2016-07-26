import Interfaces.Phone;
import Interfaces.Watch;

/**
 * Created by diana on 7/26/16.
 */
public class PhoneFactory extends AbstractFactory {

    @Override
    Phone getPhone(String phoneModel) {
        switch (phoneModel){
            case "SAMSUNG":
                return new Samsung();
            case "IPHONE":
                return new IPhone();
            default:
                return null;
        }
    }

    @Override
    Watch getWatch(String watchModel) {
        return null;
    }
}
