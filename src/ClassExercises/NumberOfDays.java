import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a month number: \n");

		int monthNumber = input.nextInt();

		System.out.print("Enter a year: ");

		int year = input.nextInt();
		
		int numberOfDaysSeptAprJunNov = 30;
		int numberOfDaysJanMarMayJulAugOctDec = 31;
		int numberOfDaysFeb = 28;

		int leapYear = year % 4;

		if (monthNumber == 2 ) {
		
			System.out.printf("February %d has %d days %n", year, numberOfDaysFeb);
		}
	
		else if (monthNumber == 1 ) {
			System.out.printf("January %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);

		}

		else if (monthNumber == 3) {
			System.out.printf("March %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);
		}

		else if (monthNumber == 4) {
			System.out.printf("April %d has %d days %n", year, numberOfDaysSeptAprJunNov);
		}

		else if (monthNumber == 5) {
			System.out.printf("May %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);
		
		}

		else if (monthNumber == 6) {
			System.out.printf("June %d has %d days %n", year, numberOfDaysSeptAprJunNov);
		
		}

		else if (monthNumber == 7) {
			System.out.printf("July %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);
		
		}

		else if (monthNumber == 8) {
			System.out.printf("August %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);
		
		}

		else if (monthNumber == 9) {
			System.out.printf("September %d has %d days %n", year, numberOfDaysSeptAprJunNov);
		
		}

		else if (monthNumber == 10) {
			System.out.printf("October %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);
		
		}

		else if (monthNumber == 11) {
			System.out.printf("November %d has %d days %n", year, numberOfDaysSeptAprJunNov);
		
		}
		
		else if (monthNumber == 12) {
			System.out.printf("December %d has %d days %n", year, numberOfDaysJanMarMayJulAugOctDec);
		
		}
		
		else if (monthNumber == 2 && leapYear == 0) {
			System.out.printf("February %d has 29 days", year);
		}
	}

}