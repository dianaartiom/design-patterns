/**
 * Created by diana on 7/28/16.
 */
public class Main {

    private static final String colors[] = {"red", "green", "blue", "yellow", "black"};

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle)shapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
