package cv.after.template;

import cv.after.template.element.line.LineFactory;
import cv.after.template.element.paragraph.ParagraphFactory;
import cv.after.template.element.paragraph.ParagraphTypes;
import org.springframework.stereotype.Component;

@Component
public class BlueTemplate extends Template {

    public BlueTemplate(ParagraphFactory paragraphFactory, LineFactory lineFactory) {
        super(paragraphFactory, lineFactory);
    }

    @Override
    protected void drawBody() {
        layout.addElement(paragraphFactory.create(ParagraphTypes.DEFAULT, "BlueTemplate body"));
    }

}
