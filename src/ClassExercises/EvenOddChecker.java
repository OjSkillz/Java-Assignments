import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a number: ");
		int usersNumber = input.nextInt();
		
		if (usersNumber % 2 == 0) {
			System.out.println("\n1");
		}
		
		else {
			System.out.println("\n0");
			
		}

		
	
	}

}