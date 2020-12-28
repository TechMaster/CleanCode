package Lamp;

public class JapaneseLamp extends CommonLamp {

  @Override
  public void connectToPowerOutlet(int voltage) throws WrongVoltageException {
    if ((voltage > 120) || (voltage < 90)) {
      throw new WrongVoltageException("Wrong voltage " + voltage);    
    }

    System.out.println("Connect to power outlet at voltage " + voltage);
  }

  @Override
  public void turnOff() {
    System.out.println("Tối dần");
    super.turnOff();
  }

  @Override
  public void turnOn() {
    System.out.println("Sáng dần");
    super.turnOn();
  }  
}
