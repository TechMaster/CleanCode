package family;

import java.util.List;

public class Family {
  public void test() {
    Son son = new Son("Jim");
    son.play();
    son.breastStrokeSwim();
  }
}

class Person {
  protected String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

class Father extends Person {
  public Father(String name) {
    super(name);
  }

  protected List<Son> sons;
}

interface PlayGuitare {
  public void play();
}

interface Swim {
  public final double INTERFACE_CONSTANT = 10.0;

  public void freeStyleSwim();

  public void breastStrokeSwim();
}

class Son extends Father implements PlayGuitare, Swim {

  public Son(String name) {
    super(name);
  }

  @Override
  public void play() {
    System.out.println("play guitare");
  }

  @Override
  public void breastStrokeSwim() {
    System.out.println("swim breast stroke");
  }

  @Override
  public void freeStyleSwim() {
    System.out.println("free style stroke");
  }
}

interface Fly {
  public void fly();
}

interface BetterFly extends Fly {
  public void glide();
}

class Eagle implements BetterFly {

  @Override
  public void glide() {
    System.out.println("glide");
  }

  @Override
  public void fly() {
    System.out.println("fly");
  }
}

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