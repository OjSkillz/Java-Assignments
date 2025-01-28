

import java.util.Scanner; 
public class NumberTypes {
   public static void main(String[] args) {

	int integerCounter = 1;
	int positivesCounter = 0;
	int negativesCounter = 0;
	int zerosCounter = 0;
	
     Scanner input = new Scanner(System.in);	
     System.out.println("\nEnter five whole integers: ");
	
     while (integerCounter <=5) {
	   int number = input.nextInt();
	
	   if (number > 0) {
	    positivesCounter++;
	   }
	
	   if (number < 0) {
	 negativesCounter++;
	   }
	
	   if (number == 0) {
	 zerosCounter++; 
	   }

	 integerCounter++;
	 }

   	System.out.println("\nThe number of negative integers input is " + 	negativesCounter);
	
   	System.out.println("The number of positive integers input is " + 	positivesCounter);
   	
	System.out.println("The number of zeros input is " + zerosCounter);

   }


}

