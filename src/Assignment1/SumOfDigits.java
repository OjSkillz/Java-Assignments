package Assignment1;

import java.util.Scanner; // import Scanner 

public class SumOfDigits { 
   /* main method begins execution of program */
     public static void main(String[] args) {
     /* create a Scanner to read input from command window */ 
     Scanner input = new Scanner(System.in); 

     System.out.print(" \nEnter a 3-digit integer between 0 and 1000: "); // prompt user  
     int number = input.nextInt(); 
     int digit3 = number % 10; 
     int number1 = number / 10;
     int digit2 =  number1 % 10;
     int digit1 = number1 /10;
     int sum = digit1 + digit2 + digit3;

     System.out.println("\nThe sum of all digits is " + sum);
     
} // end method main


} // end class SumOfDigits