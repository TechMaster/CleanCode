package Lamp;

public class WrongVoltageException  extends Exception{

  private static final long serialVersionUID = 8918011791285967279L;

  public WrongVoltageException(String message) {
    super(message);
  }
  
}
