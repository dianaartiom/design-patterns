/**
 * Created by diana on 7/28/16.
 */
public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redTriangle =  new SpecificShapeDecorator(new Triangle());

        System.out.println("Red triangle here: ");
        redTriangle.draw();
    }
}
