package cv.v1.template;

import cv.v1.model.UserInfo;
import cv.v1.template.layout.Line;
import cv.v1.template.layout.Paragraph;
import cv.v1.template.layout.TemplateLayout;

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
