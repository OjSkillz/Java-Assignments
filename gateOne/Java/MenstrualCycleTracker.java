import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class MenstrualCycleTracker{
  public static void main(String...args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter your start date in the format yyyy,mm,dd >> ");
  int startDate = input.nextInt();
  
  System.out.print("Enter your end date in the format yyyy,mm,dd >> ");
  int endDate = input.nextInt();
  
  getCycleLength(startDate, endDate) ;
  
  
  }
  
  public static int getCycleLength(int dateOne, int dateTwo) {
    LocalDate startDateFormatted = LocalDate.of(dateOne);
    LocalDate endDateFormatted = LocalDate.of(dateTwo);
    Period interval = Period.between(startDateFormatted, endDateFormatted);
    int cycleLength = interval.getDays();
    return cycleLength;
  }

  
}
