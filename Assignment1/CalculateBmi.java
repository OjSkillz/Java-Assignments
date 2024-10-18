
import java.util.Scanner;

public class CalculateBmi {
   public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
      System.out.print("\nEnter your weight in pounds: ");
      int weight = input.nextInt();
      System.out.print("\nEnter your height in inches: ");
      int height = input.nextInt(); 
      int bmi = (weight * 703) / (height * height);
    System.out.println("\nYour Body Mass Index (BMI) is " + bmi + "\n");
    
    System.out.println("Check your BMI category using the data below: "); 

    System.out.println("\n\tBMI Category\tValues");
    System.out.println("\n\tUnderweight\t<18.5\n");
    System.out.println("\tNormal Weight\t18.5-24.9\n");
    System.out.println("\tOverweight\t25-29.9\n");
    System.out.println("\tObesity\t\t30 and above\n");


}

}