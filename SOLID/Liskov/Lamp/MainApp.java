package Lamp;

public class MainApp {
  public static void main(String[] args) {
    System.out.println("Liskov Principle");

    CommonLamp lamp = new LEDLamp();

    lamp.turnOn();
    lamp.turnOff();

    CommonLamp japaneseLamp = new JapaneseLamp();

    try {
      japaneseLamp.connectToPowerOutlet(220);
    } catch (WrongVoltageException e) {
      System.out.println(e);
    }
  }
}
