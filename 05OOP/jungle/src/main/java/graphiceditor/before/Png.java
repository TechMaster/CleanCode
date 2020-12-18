package graphiceditor.before;

public class Png {
  public static final String EXTENSION = "png";
  private String fileOpenned;

  public void getFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  get " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void readFile() {
    System.out.println(EXTENSION + ": read");
  }

  public void save() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  save");
    } else {
      System.out.println("Nothing to save");
    }
  }
}
