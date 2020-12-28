package Lamp;

public class LEDLamp extends CommonLamp {

  @Override
  public void turnOn() {
    System.out.println("Turn Off LED lamp"); // Trong phương thức bật đèn thì lại tắt đèn
  }

  @Override
  public void turnOff() {
    System.out.println("Turn On LED lamp"); //Trong phương thức tắt đèn thì lại bật đèn
  }
  
}
