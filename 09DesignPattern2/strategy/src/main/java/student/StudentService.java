package student;

import student.strategies.ByAgeStrategy;
import student.strategies.ByNameStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Context
 */
public class StudentService {

    private static Map<String, SortingStrategy> strategies;

    static {
        strategies = new HashMap<>();
        strategies.put("name", new ByNameStrategy());
        strategies.put("age", new ByAgeStrategy());
    }

    public List<Student> listStudents(String sortBy) {
        SortingStrategy sortingStrategy = lookupSortingStrategy(sortBy);
        List<Student> students = queryStudents();
        sortingStrategy.sort(students);
        return students;
    }

    private List<Student> queryStudents() {
        return Arrays.asList(
                new Student(1, "Alice", 19),
                new Student(2, "Bob", 18),
                new Student(3, "Andy", 20)
        );
    }

    private SortingStrategy lookupSortingStrategy(String strategyName) {
        SortingStrategy sortingStrategy = strategies.get(strategyName);
        if (sortingStrategy == null) {
            throw new UnsupportedOperationException("Unsupported sorting strategy");
        }
        return sortingStrategy;
    }

}
