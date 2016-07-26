import Interfaces.Watch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by diana on 7/26/16.
 */
public class Rollex implements Watch {

    @Override
    public void getHour() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Rollex time:" + dateFormat.format(date));
    }
}
