import java.util.Scanner;

public class EligibilityChecker {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("What's your age? ");
    int userAge = input.nextInt();
    
    if (userAge >= 16) System.out.println("You can drive");
    if (userAge >= 18) System.out.println("You can vote");
    if (userAge >= 21) System.out.println("You can drink");
    
  }
}
