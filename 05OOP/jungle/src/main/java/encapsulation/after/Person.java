package encapsulation.after;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
  private String name;
  private String familyName;
  private String email;
  private Address address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public String getFullName() {
    return familyName + " " + name;
  }

  public String getEmail() {
    return email;
  }

  //Setter bổ xung validation
  public void setEmail(String email) throws Exception{
    final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
    Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    Matcher matcher = pattern.matcher(email);
    if (matcher.matches()) {
      this.email = email;
    } else {
      throw new Exception("Invalid email " + email);
    }
    
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Person(String name, String familyName, String email, Address address) throws Exception {
    this.name = name;
    this.familyName = familyName;
    this.setEmail(email);
    this.address = address;
  }
}
