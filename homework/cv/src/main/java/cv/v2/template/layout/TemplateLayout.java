package cv.v2.template.layout;

import java.util.ArrayList;
import java.util.List;

/** Heavy object to represent graph elements on template */
public class TemplateLayout {

    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

}
