import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a number: ");
	
		double usersNumber = input.nextDouble();

		if ( usersNumber > 0 ) {
			System.out.print("\nNumber is positive\n");

		}
		else if ( usersNumber < 0 ) {

			System.out.print("\nNumber is negative\n");

		}

		else if ( usersNumber == 0) {

			System.out.print("\nNumber is neutral (neither positive nor negative)\n");
		}
	}
}