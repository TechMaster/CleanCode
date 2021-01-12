package student;

public class StudentApplication {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        System.out.println(studentService.listStudents("name"));
        System.out.println(studentService.listStudents("age"));
    }

}
