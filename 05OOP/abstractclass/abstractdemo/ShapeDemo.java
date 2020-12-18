package abstractdemo;

abstract class Shape {
  protected String name = " "; //Thuộc tính này để là protected hay public thì class con sẽ nhìn thấy được

  Shape(String name) {
    this.name = name;
  }

  // Abstract class có thể chứa non abstract (concrete) method
  public void moveTo(double x, double y) {
    System.out.println(this.name + " " + "has been moved to" + " x = " + x + " and y = " + y);
  }

  // abstract methods. Bất kỳ class nào kế thừa sẽ phải Override 
  public abstract double area();
  public abstract void draw();
}

class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double length, double width, String name) {
    super(name);  //Gọi để constructor class cha để truyền vào name
    this.length = length;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println(name + "has been drawn");
  }

  @Override
  public double area() {
    return length * width;
  }
}

class Circle extends Shape {
  double pi = 3.14;
  double radius;

  Circle(double radius, String name) {
    super(name);
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println(this.name + " has been drawn");
  }

  @Override
  public double area() {
    return (pi * radius * radius) / 2.0;
  }
}

public class ShapeDemo {
  public static void main(String[] args) {
    Shape rect = new Rectangle(2, 3, "Rectangle");
    System.out.println("Area of rectangle: " + rect.area());
    rect.moveTo(1, 2);

    System.out.println(" ");

    // creating the Objects of circle class
    Shape circle = new Circle(2, "Circle");
    System.out.println("Area of circle: " + circle.area());
    circle.moveTo(2, 4);
    circle.draw();
  }
}
