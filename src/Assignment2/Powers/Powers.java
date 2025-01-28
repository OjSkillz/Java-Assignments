import java.util.Scanner;

public class Powers {

   public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter two whole numbers x and y: ");
	
	System.out.print("\nx: ");
	int x = input.nextInt();
        System.out.print("\ny: ");
	int y = input.nextInt();
	
	System.out.println("\nChoose either of the following options: ");

	System.out.println("\n1. Type \"A\" to raise x to the power of y");
	System.out.println("\n2. Type \"B\" to raise y to the power of x\n");
	
	char response = input.next().charAt(0);
	
	int power = 0;
	int result = 1;
	
	if (response == 'A') {
	
	   while (power < y) {
	      result = result * x;
	      power++;
           }

 	   System.out.println("\nx raised to the power of y is " + 	   result);
	}	
	   

	if (response == 'B') {
	   
	    while (power < x) {
	      result = result * y;
	      power++;
	    }

	    System.out.println("\ny raised to the power of x is " + 	    result);

	}
	   
   }
}