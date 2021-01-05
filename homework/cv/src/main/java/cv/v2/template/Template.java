package cv.v2.template;

import cv.v2.model.UserInfo;
import cv.v2.template.layout.TemplateLayout;
import cv.v2.template.layout.line.LineFactory;
import cv.v2.template.layout.line.LineTypes;
import cv.v2.template.layout.paragraph.ParagraphFactory;
import cv.v2.template.layout.paragraph.ParagraphTypes;

/**
 * Apply template method pattern here
 */
public abstract class Template {

    protected TemplateLayout layout;
    protected UserInfo userInfo;

    protected final ParagraphFactory paragraphFactory;
    protected final LineFactory lineFactory;

    public Template(ParagraphFactory paragraphFactory,
                    LineFactory lineFactory) {
        this.paragraphFactory = paragraphFactory;
        this.lineFactory = lineFactory;
        this.layout = new TemplateLayout();
        drawHeader();
        drawBody();
        drawFooter();
    }

    protected void drawHeader() {
        layout.addElement(paragraphFactory.create(ParagraphTypes.DEFAULT, "Header"));
        layout.addElement(lineFactory.create(LineTypes.DEFAULT));
    }

    protected abstract void drawBody();

    private void drawFooter() {
        layout.addElement(lineFactory.create(LineTypes.DEFAULT));
        layout.addElement(paragraphFactory.create(ParagraphTypes.DEFAULT, "Footer"));
    }

    /**
     * Combine layout with user info
     */
    public String combine(UserInfo userInfo) {
        this.userInfo = userInfo;
        return "HTML";
    }

}
