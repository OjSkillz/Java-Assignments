import java.util.Scanner;

public class WorkersEfficiencyLoop {
  public static void main(String[] args) {
    
      String userFeedback;
      
      do {
      
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter the time taken for you to complete your task in"
      + " hours: ");
      double timeTaken = input.nextDouble();
      
      if (timeTaken >= 2 && timeTaken <= 3) {
        System.out.println("\nCongratulations, you are rated "+ 
        " \"Highly Efficient\" 💯 💯 ");
      } 
        else if (timeTaken >= 3 && timeTaken <= 4) {
          System.out.println("\nYou need to improve on "+ 
           " your speed❗");
        }
          else if (timeTaken >= 4 && timeTaken <= 5) {
            System.out.println("\nYou are required to "+ 
            " take a training on efficiency 🫵");
          }
            else if (timeTaken > 5) {
               System.out.println("\nYou have failed the test of efficiency "+ 
              "and are hereby ordered to leave the company❗❗❗");
            }
       Scanner scanner = new Scanner(System.in);
        
      System.out.print("\nEnter \"Yes\" to repeat this operation, " +  
      "Otherwise, Enter \"No\": ");
      
      userFeedback = scanner.nextLine();  
      
    } while (userFeedback.equalsIgnoreCase("Yes"));
        if (userFeedback.equalsIgnoreCase("No")) {
            System.out.println("\nYou have come to the end of this assessment.");
        }
  }
}
