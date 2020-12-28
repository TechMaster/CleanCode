package BulkyInheritance;

public class Tiger extends Animal {

  @Override
  public void eat() {
    System.out.println("Tiger eats");
  }

  @Override
  public void walk() {
    System.out.println("Tiger walks");
  }

  @Override
  public void breath() {
    System.out.println("Tiger breathes");
  }

  @Override
  public void swim() throws UnimplementedMethodException {
    throw new UnimplementedMethodException("Tiger cannot swim");
  }
  

  @Override
  public void crawl() throws UnimplementedMethodException{
    throw new UnimplementedMethodException("Tiger cannot crawl");

  }

  @Override
  public void fly() throws UnimplementedMethodException{
    throw new UnimplementedMethodException("Tiger cannot fly");
  }

  @Override
  public void jump() {
    System.out.println("Tiger jumps");
  }
  
}
