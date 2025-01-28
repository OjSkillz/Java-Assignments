import java.util.Scanner;

public class UnitConverter {
   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("\n Enter a number in lb: ");

	double poundsValue = input.nextDouble();
	
	double kiloValue = poundsValue * 0.454 ;
	
	System.out.printf("%n%.2flb is equivalent to %.2fKg%n", poundsValue, kiloValue);


   }
}