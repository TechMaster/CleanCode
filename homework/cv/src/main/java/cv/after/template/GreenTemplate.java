package cv.after.template;

import cv.after.template.element.line.LineFactory;
import cv.after.template.element.paragraph.ParagraphFactory;
import cv.after.template.element.paragraph.ParagraphTypes;
import org.springframework.stereotype.Component;

@Component
public class GreenTemplate extends Template {

    public GreenTemplate(ParagraphFactory paragraphFactory, LineFactory lineFactory) {
        super(paragraphFactory, lineFactory);
    }

    @Override
    protected void drawBody() {
        layout.addElement(paragraphFactory.create(ParagraphTypes.DEFAULT, "GreenTemplate body"));
    }

}
