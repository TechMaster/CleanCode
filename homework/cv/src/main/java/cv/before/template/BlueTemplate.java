package cv.before.template;

import cv.before.model.UserInfo;
import cv.before.template.element.Line;
import cv.before.template.element.Paragraph;

public class BlueTemplate {

    private TemplateLayout layout;
    private UserInfo userInfo;

    public BlueTemplate() {
        this.layout = new TemplateLayout();
        drawHeader();
        drawBody();
        drawFooter();
    }

    private void drawHeader() {
        Paragraph paragraph = new Paragraph("Header");
        // Set styles for paragraph
        layout.addElement(paragraph);

        Line line = new Line();
        // Set styles for line
        layout.addElement(line);
    }

    private void drawBody() {
        layout.addElement(new Paragraph("BlueTemplate body"));
    }

    private void drawFooter() {
        Line line = new Line();
        // Set styles for line
        layout.addElement(line);

        Paragraph paragraph = new Paragraph("Footer");
        // Set styles for paragraph
        layout.addElement(paragraph);
    }

    /**
     * Combine layout with user info
     */
    public String combine(UserInfo userInfo) {
        this.userInfo = userInfo;
        return "HTML";
    }

}
