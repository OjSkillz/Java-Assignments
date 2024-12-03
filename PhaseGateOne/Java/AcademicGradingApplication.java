import java.util.Scanner;
import java.util.Arrays;

public class AcademicGradingApplication{
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many students do you have? >> ");
    int numberOfStudents = input.nextInt();
    
    String[] students = new String[numberOfStudents];
    
    for (int index = 0; index < students.length; index++){
      students[index] = "Student";
    }
    System.out.print(Arrays.toString(students));
  }
}
