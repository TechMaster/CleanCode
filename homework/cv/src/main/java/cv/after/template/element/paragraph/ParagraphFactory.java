package cv.after.template.element.paragraph;

public class ParagraphFactory {

    public static Paragraph create(ParagraphType type, String text) {
        if (type == ParagraphType.DEFAULT) {
            Paragraph paragraph = new Paragraph(text);
            // Set styles for default paragraph
            return paragraph;
        }
        return new Paragraph(text);
    }

}
