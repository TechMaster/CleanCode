package BulkyInheritance;

public class MainApp {
  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    tiger.eat();
    tiger.breath();
    Fish fish = new Fish();

    try {
      tiger.swim();
      fish.fly();
    } catch (UnimplementedMethodException e) {
      System.out.println(e.getMessage());
    }
  }
}
