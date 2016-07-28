/**
 * Created by diana on 7/28/16.
 */
public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}
