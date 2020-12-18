package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import annotation.TesterInfo.Priority;

@JsonSerializable
public class Zoo {
  private Zoo() {
  }

  public static void listAnnotationParams() {
    try {
      for (Annotation annotation : ZooCleaner.class.getAnnotations()) {
        Class<? extends Annotation> type = annotation.annotationType();
        System.out.println("Annotation name: " + type.getName());

        for (Method method : type.getDeclaredMethods()) {
          Object value = method.invoke(annotation, (Object[]) null);
          System.out.println(" " + method.getName() + ": " + value);
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void listTableAnnotationParams() {
    try {
      Entity anno = Person.class.getAnnotation(Entity.class);
      System.out.println("Table name attribute: " + anno.name());     
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}

@TesterInfo(priority = Priority.HIGH, createdBy = "Cuong", tags = { "CleanCode", "Java" }, lastModified = "2020/12/04")
class ZooCleaner {
  public void clean() {
    System.out.println("Clean the zoo");
  }
}

@Entity(name = "person")
class Person {

}