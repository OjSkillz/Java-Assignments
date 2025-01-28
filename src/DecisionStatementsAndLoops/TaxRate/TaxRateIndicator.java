import java.util.Scanner;

public class TaxRateIndicator {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nWhat is your annual income in $?  ");
    double annualIncome = input.nextDouble();
    
    if (annualIncome <=  9_875) System.out.println("\n0 - $9,875: 10%");
    else if (annualIncome >= 9_876 && annualIncome <= 40_125) System.out.println("\n$9,876 - $40,125: 12%");
    else if (annualIncome >= 40_126 && annualIncome <= 85_525) System.out.println("\n$40,126 - $85,525: 22%");
    else System.out.println("\n$85,526 and above: 24%");
  
  }
}
