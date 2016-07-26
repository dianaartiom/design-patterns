/**
 * Created by diana on 7/26/16.
 */
public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        Phone cell1 = phoneFactory.getPhone(0);
        Phone cell2 = phoneFactory.getPhone(1);

        cell1.ring();
        cell2.ring();
    }
}
