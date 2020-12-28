package BulkyInheritance;

public class Fish extends Animal {

  @Override
  public void breath() {
    System.out.print("Fish breathes");

  }

  @Override
  public void crawl() throws UnimplementedMethodException {
    throw new UnimplementedMethodException("Fish cannot crawl");
  }

  @Override
  public void eat() {
    System.out.print("Fish eats");
  }

  @Override
  public void fly() throws UnimplementedMethodException {
    throw new UnimplementedMethodException("Fish cannot fly");
  }

  @Override
  public void jump() throws UnimplementedMethodException {
    throw new UnimplementedMethodException("Fish cannot jump");
  }

  @Override
  public void swim() throws UnimplementedMethodException {
    System.out.print("Fish is born to swims");

  }

  @Override
  public void walk() throws UnimplementedMethodException {
    throw new UnimplementedMethodException("Fish cannot walk");
  }

}