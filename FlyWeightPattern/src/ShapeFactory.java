import java.util.HashMap;

/**
 * Created by diana on 7/28/16.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {

        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Created a circle of color: " + color);
        }

        return circle;
    }


}
