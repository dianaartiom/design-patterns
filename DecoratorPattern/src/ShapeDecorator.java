/**
 * Created by diana on 7/28/16.
 */
public abstract class ShapeDecorator implements Shape {

    Shape shape;

    public ShapeDecorator(Shape _shape) {
        this.shape = _shape;
    }

    public void draw() {
        this.shape.draw();
    }
}
