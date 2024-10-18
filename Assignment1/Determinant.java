/** This is an application that can read a number of integer inputs,  determine the number of negative integers, positive integers and zeros input */

// 2.32 Negative, Positive and Zeroes input

import java.util.Scanner; /* import Scanner to read input from command window/user */

public class Determinant {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();
	System.out.print("\nEnter second number: ");
	int number2 = input.nextInt();
	System.out.print("\nEnter third number: ");
	int number3 = input.nextInt();
	System.out.print("\nEnter fourth number: ");
	int number4 = input.nextInt();
	System.out.print("\nEnter fifth number: ");
	int number5 = input.nextInt();
	
	
	int positive = 0;
	int negative = 0;
	int zeros = 0;
	
	if (number1 > 0) {
	 positive = positive + 1;
	}
	
	if (number1 < 0) {
	 negative = negative +1;
	}
	
	if (number1 == 0) {
	 zeros = zeros +1; 
	}
	
	if (number2 > 0) {
	 positive = positive + 1;}
	
	if (number2 < 0) {
	 negative = negative +1;}
	
	if (number2 == 0) {
	 zeros = zeros +1; }

	if (number3 > 0) {
	 positive = positive + 1;}
	
	if (number3 < 0) {
	 negative = negative +1;}
	
	if (number3 == 0) {
	 zeros = zeros +1; }

	if (number4 > 0) {
	 positive = positive + 1;}
	
	if (number4 < 0) {
	 negative = negative +1;}
	
	if (number4 == 0) {
	 zeros = zeros +1; }

	if (number5 > 0) {
	 positive = positive + 1;}
	
	if (number5 < 0) {
	 negative = negative +1;}
	
	if (number5 == 0) {
	 zeros = zeros +1; }

   	System.out.println("\nThe number of negative numbers input is " + negative);
	
   	System.out.println("The number of positive numbers input is " + positive);
   	
	System.out.println("The number of zeros input is " + negative);

}


}

