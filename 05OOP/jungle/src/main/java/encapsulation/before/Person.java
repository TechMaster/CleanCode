package encapsulation.before;

public class Person {
  public String name;
  public String familyName;
  public String email;
  public String address_country;
  public String address_city;
  public String address_street;

  public Person(String name, String familyName, String email, String address_country, String address_city,
      String address_street) {
    this.name = name;
    this.familyName = familyName;
    this.email = email;
    this.address_country = address_country;
    this.address_city = address_city;
    this.address_street = address_street;
  }
}
