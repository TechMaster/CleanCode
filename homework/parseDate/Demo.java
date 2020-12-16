import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo {

  static void findDifference(LocalDate startDate, LocalDate endDate) {

    // find the period between
    // the start and end date
    Period diff = Period.between(startDate, endDate);

    // Print the date difference
    // in years, months, and days
    System.out.println("Difference between two dates is: ");

    // Print the result
    System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
  }

  // Driver Code
  public static void main(String[] args) {
    DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    LocalDate startDate = LocalDate.parse("19751127", DATEFORMATTER);


    // End date
    LocalDate endDate = LocalDate.now();

    // Function Call
    findDifference(startDate, endDate);
  }
}