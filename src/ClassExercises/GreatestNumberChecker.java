import java.util.Scanner;

public class GreatestNumberChecker {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter first number: ");
		int firstNumber = input.nextInt();

		System.out.println("\nEnter second number: ");
		int secondNumber = input.nextInt();

		System.out.println("\nEnter third number: ");
		int thirdNumber = input.nextInt();
		
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {

			System.out.printf("\nThe greatest of all three numbers is %d%n", firstNumber);
		}
		else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.printf("\nThe greatest of all three numbers is %d%n", secondNumber);
		}
		else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.printf("\nThe greatest of all three numbers is %d%n", thirdNumber);
		}
	}
}