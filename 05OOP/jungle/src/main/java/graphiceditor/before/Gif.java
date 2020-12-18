package graphiceditor.before;

public class Gif {
  public static final String EXTENSION = "gif";
  private String fileOpenned;

  public void fileOpen(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  open " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void readFile() {
    System.out.println(EXTENSION + ": read");
  }

  public void persist() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  persist");
    } else {
      System.out.println("Nothing to save");
    }
  }
}
