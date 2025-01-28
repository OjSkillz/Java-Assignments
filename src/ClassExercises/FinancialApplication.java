package ClassExercises;

import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		
		System.out.print("Enter investment amount: ");
	
		Scanner input = new Scanner(System.in);

		double investmentAmount = input.nextDouble();

		System.out.print("\nEnter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		double NUMBEROFMONTHSCONSTANT = 12;

		double monthlyInterestRate = (annualInterestRate / 100) / 12;

		System.out.print("\nEnter number of years: ");
		double numberOfYears = input.nextDouble();

		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + 			monthlyInterestRate), (numberOfYears * 12));

		System.out.printf("\nYour future investment value is $%.2f%n", 				futureInvestmentValue );
	

	}
}

