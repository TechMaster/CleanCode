package interfacedemo;

interface Shape {
  public void moveTo(double x, double y);
  public double area();
  public void draw();
  public static final double GOLDEN_RATIO = 1.618;
  public static double SQUARE_RATIO = 1.0;
}

class Rectangle implements Shape {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Rectangle has been drawn");
  }

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public void moveTo(double x, double y) {
    System.out.println("Rectangle moved to " + x + ", " + y);
  }
}

class Circle implements Shape {
  double pi = 3.14;
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Circle has been drawn");
  }

  @Override
  public double area() {
    return (pi * radius * radius) / 2.0;
  }

  @Override
  public void moveTo(double x, double y) {
    System.out.println("Circle moved to " + x + ", " + y);
  }
}

public class IShapeDemo {
  public static void main(String[] args) {
    Shape rect = new Rectangle(2, 3);
    System.out.println("Area of rectangle: " + rect.area());
    rect.moveTo(1, 2);
    System.out.println(" ");
    Shape circle = new Circle(2);
    System.out.println("Area of circle: " + circle.area());
    circle.moveTo(2, 4);
    circle.draw();
  }
}
