package encapsulation.after;

import java.util.Arrays;
import java.util.Locale;

public class Address {
  private String countryCode;
  private String cityProvice;
  private String street;
  private String blockBuilding;
  private static final String[] arrayCountryCode = Locale.getISOCountries();

  public Address(String countryCode, String cityProvice, String street, String blockBuilding) throws Exception{
    this.setCountryCode(countryCode);
    this.cityProvice = cityProvice;
    this.street = street;
    this.blockBuilding = blockBuilding;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) throws Exception {
    boolean result = Arrays.stream(arrayCountryCode).anyMatch(countryCode::equals);
    if (result) {
      this.countryCode = countryCode;
    } else {
      throw new Exception("bad country code: " + countryCode);
    }
    
  }

}
