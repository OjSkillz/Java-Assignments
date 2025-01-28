
public class SumOfNaturalNumbers {
    public static void main(String[] args) {

	int naturalNumber = 1;
	int sum = 0;
		    
	
	while (naturalNumber <=10) {

	   sum = sum + naturalNumber;

	   naturalNumber++; 
	}

	System.out.print("\nThe sum of the first ten natural numbers");
	System.out.println(" is " + sum);
	    
	
    }
}