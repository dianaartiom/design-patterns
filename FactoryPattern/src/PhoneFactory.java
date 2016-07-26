import java.awt.*;

/**
 * Created by diana on 7/26/16.
 */
public class PhoneFactory {

    public Phone getPhone(int i) {
        switch (i){
            case 0:
                return new IPhone();
            case 1:
                return new Samsung();
            default:
                return null;
        }
    }
}
