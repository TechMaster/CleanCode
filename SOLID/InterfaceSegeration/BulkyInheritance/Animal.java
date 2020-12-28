package BulkyInheritance;

public abstract class Animal {
  public abstract void eat();
  public abstract void breath();
  public abstract void walk() throws UnimplementedMethodException;
  public abstract void jump() throws UnimplementedMethodException;
  public abstract void swim() throws UnimplementedMethodException;  
  public abstract void crawl() throws UnimplementedMethodException;
  public abstract void fly() throws UnimplementedMethodException;
}
