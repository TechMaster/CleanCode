package cv.after.template;

import cv.after.template.element.paragraph.ParagraphFactory;
import cv.after.template.element.paragraph.ParagraphType;

public class GreenTemplate extends Template {

    @Override
    protected void drawBody() {
        layout.addElement(ParagraphFactory.create(ParagraphType.DEFAULT, "GreenTemplate body"));
    }

}
