package Lamp;

public abstract class CommonLamp {
  public void connectToPowerOutlet(int voltage) throws WrongVoltageException {
    if ((voltage > 230) || (voltage < 180)) {
      throw new WrongVoltageException("Wrong voltage " + voltage);    
    }

    System.out.println("Connect to power outlet at voltage " + voltage);
  }

  public void turnOn() {
    System.out.println("Turn on lamp");
  }

  public void turnOff() {
    System.out.println("Turn off lamp");
  }  
}
