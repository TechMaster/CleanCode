package cv.after.template;

import cv.after.model.UserInfo;
import cv.after.template.element.line.LineFactory;
import cv.after.template.element.line.LineType;
import cv.after.template.element.paragraph.ParagraphFactory;
import cv.after.template.element.paragraph.ParagraphType;

/**
 * Apply template method pattern here
 */
public abstract class Template {

    protected TemplateLayout layout;
    protected UserInfo userInfo;

    public Template() {
        this.layout = new TemplateLayout();
        drawHeader();
        drawBody();
        drawFooter();
    }

    protected void drawHeader() {
        layout.addElement(ParagraphFactory.create(ParagraphType.DEFAULT, "Header"));
        layout.addElement(LineFactory.create(LineType.DEFAULT));
    }

    protected abstract void drawBody();

    private void drawFooter() {
        layout.addElement(LineFactory.create(LineType.DEFAULT));
        layout.addElement(ParagraphFactory.create(ParagraphType.DEFAULT, "Footer"));
    }

    /**
     * Combine layout with user info
     */
    public String combine(UserInfo userInfo) {
        this.userInfo = userInfo;
        return "HTML";
    }

}
