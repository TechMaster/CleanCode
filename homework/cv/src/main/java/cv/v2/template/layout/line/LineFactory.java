package cv.v2.template.layout.line;

import org.springframework.stereotype.Component;

@Component
public class LineFactory {

    public Line create(LineTypes type) {
        if (type == LineTypes.DEFAULT) {
            Line line = new Line();
            // Set styles for line
            return line;
        }
        return new Line();
    }

}
