import java.util.Scanner;

public class WorkersEfficiency {
  public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter the time taken for you to complete task xyz in"
      + " hours: ");
      int timeTaken = input.nextInt();
      
      if (timeTaken >= 2 && timeTaken <= 3) {
        System.out.println("\nCongratulations, you are rated "+ 
        " \"Highly Efficient\" ");
      } 
        else if (timeTaken >= 3 && timeTaken <= 4) {
          System.out.println("\nYou need to improve on "+ 
           " your speed");
        }
          else if (timeTaken >= 4 && timeTaken <= 5) {
            System.out.println("\nYou are required to "+ 
            " take a training on efficiency");
          }
            else if (timeTaken > 5) {
               System.out.println("\nYou have failed the test of efficiency "+ 
              "and are hereby ordered to leave the company");
            }
  }
}
