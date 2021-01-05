package cv.v2.template.layout.paragraph;

import org.springframework.stereotype.Component;

@Component
public class ParagraphFactory {

    public Paragraph create(ParagraphTypes type, String text) {
        if (type == ParagraphTypes.DEFAULT) {
            Paragraph paragraph = new Paragraph(text);
            // Set styles for line
            return paragraph;
        }
        return new Paragraph(text);
    }

}
