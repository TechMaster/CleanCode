package demointerface;

public class DemoInterface {
  
}

interface Fly {
  public void fly();
}

interface BetterFly extends Fly {
  public void glide();
}

class Eagle implements BetterFly {

  @Override
  public void glide() {  //<-- BetterFly
    System.out.println("glide");
  }

  @Override
  public void fly() {   //<-- Fly
    System.out.println("fly");
  }
}
//----------------
//Interface nằm trong Interface
interface Utility {
  public interface Zip {
    public void compress();
    public static void fun() {
      System.out.println();
    }
  }
}

interface Sevenzip extends Utility.Zip {
  public void strongCompress();
}
