public class TableDisplay {

   public static void main(String[] args) {

	int counter = 1;
	int a = 0;
	int b = 1;

	System.out.println("a\tb\tpow(a, b)");

	while (counter <= 5) {
		
	   a++;
	   b++;
	 
	   System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a, b));
	
 	    
	   counter++;
	  
	
	}

}

}

