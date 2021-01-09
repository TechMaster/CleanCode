package shape;

/**
 * Creator
 */
public class ShapeFactory {

    public Shape createShape(String shape) {
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("triangle".equalsIgnoreCase(shape)) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape");
        }
    }

}
