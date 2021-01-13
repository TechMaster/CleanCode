package cv.after.template;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight factory
 */
public class TemplateFactory {

    private final Map<TemplateType, Template> cache = new HashMap<>();

    public Template getTemplate(TemplateType templateType) {
        Template template = cache.get(templateType);
        if (template != null) {
            return template;
        }
        return createTemplate(templateType);
    }

    private Template createTemplate(TemplateType templateType) {
        Template template;
        if (templateType == TemplateType.BLUE) {
            template = new BlueTemplate();
        } else if (templateType == TemplateType.GREEN) {
            template = new GreenTemplate();
        } else if (templateType == TemplateType.RED) {
            template = new RedTemplate();
        } else {
            throw new UnsupportedOperationException("Unsupported template");
        }
        cache.put(templateType, template);
        System.out.printf("Create template %s\n", templateType);
        return template;
    }

}
