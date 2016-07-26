import Interfaces.Phone;
import Interfaces.Watch;

/**
 * Created by diana on 7/26/16.
 */
public abstract class AbstractFactory {
    abstract Phone getPhone(String phoneModel);
    abstract Watch getWatch(String watchModel);
}
