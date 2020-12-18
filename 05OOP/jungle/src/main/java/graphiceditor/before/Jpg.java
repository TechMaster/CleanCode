package graphiceditor.before;

public class Jpg {
  public static final String EXTENSION = "jpg";
  private String fileOpenned;

  public void openF(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  openF " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void readF() {
    System.out.println(EXTENSION + ": readF");
  }

  public void saveF() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  saveF");
    } else {
      System.out.println("Nothing to save");
    }
  }
}
