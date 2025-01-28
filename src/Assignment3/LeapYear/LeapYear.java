import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter any year to check whether it is a leap year: ");
    int year = input.nextInt();
    
    if (year % 4 == 0 ) {
      System.out.println("\n" + year + " is a leap year");
    }
    else {
      System.out.println("\n" + year + " is not a leap year");
    }
  }
}
