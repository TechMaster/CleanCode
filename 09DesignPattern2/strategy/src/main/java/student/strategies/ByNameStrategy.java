package student.strategies;

import student.SortingStrategy;
import student.Student;

import java.util.Comparator;
import java.util.List;

/**
 * Sort by name ascending strategy
 */
public class ByNameStrategy implements SortingStrategy {

    @Override
    public void sort(List<Student> students) {
        students.sort(Comparator.comparing(Student::getName));
    }

}
