package university;

public class University {
  public void teach() {
    Professor prof = new Professor("Steven Hawking");
    Student student = new Student("Trịnh Minh Cường");
    prof.advise(student);
    student.reportTo(prof);
  }
}

class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }
}

class Professor extends Person {
  public void advise(Student student) {
    System.out.println("Advise " + student.name);
  }

  public Professor(String name) {
    super(name);
  }
}

class Student extends Person {
  public void reportTo(Professor professor) {
    System.out.println("Report to " + professor.name);
  }

  public Student(String name) {
    super(name);
  }
}