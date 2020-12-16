package vn.techmaster.payroll.model;

public class Employee {
  private String name;
  private String dob;
  private String role;
  private String startdate;
  private int salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getStartdate() {
    return startdate;
  }

  public void setStartdate(String startdate) {
    this.startdate = startdate;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [dob=" + dob + ", name=" + name + ", role=" + role + ", salary=" + salary + ", startdate="
        + startdate + "]";
  }
}
