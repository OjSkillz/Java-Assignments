import java.util.Scanner;

public class ValidatingUserInput {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    int passes = 0;
    int failures = 0;
    int studentCounter = 1;
    
    int result;
   do{
      System.out.print("\nEnter next exam result (1 for pass, 2 for fail): ");
      result = input.nextInt();
      
      if (result == 1) passes += 1;
      else if (result == 2) failures++;
      
      if (result > 2) {
        System.out.println("\nValue out of range; enter 1 for pass or 2 for fail");
        ;
        studentCounter--;
      }
      studentCounter++;
    } while (studentCounter <= 10);
    System.out.printf("Number of passes = %d%nNumber of" + 
    " failures = %d%n", passes, failures);
    
    if (passes > 8) System.out.println("Bonus to instructor!");
  }
}
