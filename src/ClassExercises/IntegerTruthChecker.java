import java.util.Scanner;

public class IntegerTruthChecker {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		
		System.out.print("\nEnter first integer: ");
		int firstNumber = input.nextInt();
		
		System.out.print("\nEnter second integer: ");
		int secondNumber = input.nextInt();
		
		
		System.out.print("\nEnter third integer: ");
		int thirdNumber = input.nextInt();
		
		int firstNumberOutermostDigit = firstNumber % 10;
		int secondNumberOutermostDigit = secondNumber % 10;
		int thirdNumberOutermostDigit = thirdNumber % 10;

		if (firstNumberOutermostDigit == secondNumberOutermostDigit || firstNumberOutermostDigit == thirdNumberOutermostDigit || secondNumberOutermostDigit == thirdNumberOutermostDigit) {

			System.out.println("\nTrue");
		}

		

		else { 
			System.out.println("\nFalse"); 
		}
		
		

	}
}