package ClassExercises;

import java.util.Scanner;

public class BmiCalculator {
   public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter your weight in pounds: ");
	double poundsWeight = input.nextDouble();

	double kiloWeight = poundsWeight * 0.45359237;

	System.out.print("\nEnter your height in inches: ");
	double inchesHeight = input.nextDouble();

	double metersHeight = inchesHeight * 0.0254;

	double BMI = kiloWeight / Math.pow(metersHeight, 2);
	
	
	System.out.printf("%nYour Body Mass Index (BMI) is %.2f%n", BMI);



}
}