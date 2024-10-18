/** This is an application that reads an integer and determines whether or not it is a palindrome integer */

//3.12 Palindrome Integer

import java.util.Scanner;

public class PalindromeChecker {  // class declaration 
   public static void main(String[] args) {
     Scanner  input = new Scanner(System.in);
       System.out.print("\nEnter a 3-digit integer: ");
	int number = input.nextInt();
	int firstDigit = number / 100 ;
	int thirdDigit  = number % 10 ;
 	 
  	if(firstDigit == thirdDigit) { //if selection statement
	
	System.out.println("\n" + number + " is a palindrome integer"); 
	}
	
	else {
	System.out.println("\n" + number + " is not a palindrome integer");
	}
} // end method main

} /* end class PalindromeChecker */