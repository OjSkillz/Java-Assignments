import java.util.Scanner;

public class WeekDayDisplay {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("\nEnter a number from 1 - 7 to" + 
  " check the weekday it corresponds to: ");
  int userInput = input.nextInt();
  
  if (userInput % 7 == 0) {
  System.out.println("\n" + userInput + " is a Sunday");
  }
    else if (userInput % 7 == 1) {
      System.out.println("\n" + userInput + " is a Monday");
     } 
      else if (userInput % 7 == 2) {
        System.out.println("\n" + userInput + " is a Tuesday");
       } 
        else if (userInput % 7 == 3) {
          System.out.println("\n" + userInput + " is a Wednesday");
         } 
          else if (userInput % 7 == 4) {
            System.out.println("\n" + userInput + " is a Thursday");
           } 
            else if (userInput % 7 == 5) {
              System.out.println("\n" + userInput + " is a Friday");
              }
              else if (userInput % 7 == 6) {
                System.out.println("\n" + userInput + " is a Saturday");
               } 
  }
}
