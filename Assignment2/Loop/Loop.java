import java.util.Scanner;

public class Loop {
   public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
	char response;

	do {
	
	int numberCounter = 0;	
	int sum = 0;

	System.out.println("\nEnter two numbers: \n");

	   while (numberCounter < 2) {
		int number = input.nextInt();
		
		sum = sum + number;
		numberCounter++;

	   }
	System.out.println("\nThe sum of both numbers is " + sum);
	
	System.out.println("\nDo you wish to perform this operation again?");

	System.out.println("\nIf yes, type \"Y\". If no, type \"N\" \n"); 
	response = input.next().charAt(0);

	} 
	
 	   while (response == 'Y');  

	   System.out.println("\nThanks and bye!");
		
}

}