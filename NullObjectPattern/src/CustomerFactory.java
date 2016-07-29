/**
 * Created by diana on 7/29/16.
 */
public class CustomerFactory {

    public static final String names[] = {"Jora", "Vasea", "Misa"};

    public static AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                return  new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
