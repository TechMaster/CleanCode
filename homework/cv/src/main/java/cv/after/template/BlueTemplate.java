package cv.after.template;

import cv.after.template.element.paragraph.ParagraphFactory;
import cv.after.template.element.paragraph.ParagraphType;
import org.springframework.stereotype.Component;

@Component
public class BlueTemplate extends Template {

    @Override
    protected void drawBody() {
        layout.addElement(ParagraphFactory.create(ParagraphType.DEFAULT, "BlueTemplate body"));
    }

}
