package cv.after.template.element.line;

public class LineFactory {

    public static Line create(LineType type) {
        if (type == LineType.DEFAULT) {
            Line line = new Line();
            // Set styles for default line
            return line;
        }
        return new Line();
    }

}
