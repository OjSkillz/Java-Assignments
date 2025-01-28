import java.util.Scanner;

public class TaxCalculator {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int counter = 0;
    
    while (counter < 3) {
      counter++;
      
      System.out.print("\nName: ");
      String name = scanner.nextLine();
    
      Scanner input = new Scanner(System.in);
      
      System.out.print("\nEarnings in USD: ");  
      double earning = input.nextInt();
    
        if (earning <= 30000) {
          double tax = (15.0 / 100) * earning;
          System.out.printf("%nDear %s, your total tax is $%,.2f%n", name, tax);
        } 
          else if (earning > 30000) {
          double tax = (20.0 / 100) * earning;
          System.out.printf("%nDear %s, your total tax is $%,.2f%n", name, tax);
          }   
    }
  
  }
}
