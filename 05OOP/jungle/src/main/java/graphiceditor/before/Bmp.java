package graphiceditor.before;

public class Bmp {
  public static final String EXTENSION = "bmp";
  private String fileOpenned;

  public void openFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  open " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void parseFile() {
    System.out.println(EXTENSION + ": parse");
  }

  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  save");
    } else {
      System.out.println("Nothing to save");
    }
  }
}
