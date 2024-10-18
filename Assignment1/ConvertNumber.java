

import java.util.Scanner; 

public class SumOfDigits { 
       public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in); 

     System.out.print(" \nEnter a 3-digit integer between 0 and 1000: "); 
     int number = input.nextDouble(); 
     int digit3 = number % 10; 
     int number1 = number / 10;
     int digit2 =  number1 % 10;
     int digit1 = number1 /10;
     int sum = digit1 + digit2 + digit3;

     System.out.printf("The sum of all digits is %d%n", sum);
     
} // 


} // 