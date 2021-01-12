package cv.after.template.element.paragraph;

import org.springframework.stereotype.Component;

@Component
public class ParagraphFactory {

    public Paragraph create(ParagraphTypes type, String text) {
        if (type == ParagraphTypes.DEFAULT) {
            Paragraph paragraph = new Paragraph(text);
            // Set styles for paragraph
            return paragraph;
        }
        return new Paragraph(text);
    }

}
