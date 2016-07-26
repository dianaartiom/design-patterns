/**
 * Created by diana on 7/26/16.
 */
public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    public static SingleObject getInstance() {
        return ourInstance;
    }

    private SingleObject() { }

    public static void showMessage() {
        System.out.println("Singleton here :P");
    }
}
