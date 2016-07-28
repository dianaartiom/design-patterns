/**
 * Created by diana on 7/28/16.
 */
public class SpecificShapeDecorator extends ShapeDecorator {

    public SpecificShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedColor(shape);
    }

    public void setRedColor(Shape shape) {
        System.out.println("Added color red to the shape.");
    }
}
