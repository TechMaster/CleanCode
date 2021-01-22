package todolist.configuration.logging;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskingPatternLayout extends PatternLayout {

    private Pattern pattern;
    private List<String> maskingPatterns = new ArrayList<>();

    public void addMaskingPattern(String maskPattern) {
        maskingPatterns.add(maskPattern);
        pattern = Pattern.compile(String.join("|", maskingPatterns));
    }

    @Override
    public String doLayout(ILoggingEvent event) {
        String message = super.doLayout(event);
        return maskMessage(message);
    }

    private String maskMessage(String message) {
        if (pattern == null) {
            return message;
        }
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            String group = matcher.group();
            String replacement = new StringBuilder(group)
                    .replace(group.indexOf(": ") + 3, group.length() - 1, "******")
                    .toString();
            message = message.replace(group, replacement);
        }
        return message;
    }

}
