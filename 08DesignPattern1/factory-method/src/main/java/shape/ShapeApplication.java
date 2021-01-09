package shape;

/**
 * Client
 */
public class ShapeApplication {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();

        Shape triangle = factory.createShape("triangle");
        triangle.draw();
    }

}
