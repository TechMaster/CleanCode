package student.strategies;

import student.SortingStrategy;
import student.Student;

import java.util.Comparator;
import java.util.List;

/**
 * Sort by age descending strategy
 */
public class ByAgeStrategy implements SortingStrategy {

    @Override
    public void sort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getAge, Comparator.reverseOrder()));
    }

}
