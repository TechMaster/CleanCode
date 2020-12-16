package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // on class level
public @interface TesterInfo {
  public enum Priority {
    LOW, MEDIUM, HIGH
  }
  Priority priority() default Priority.MEDIUM;
  String[] tags() default "LogicTest";
  String createdBy() default "Techmaster";
  String lastModified() default "2020/12/03";
}
