package GroupCodeChallenge;

import java.util.Scanner;


public class PrimeFactorization {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    int primeFactors = 1;

    int nextMultiple = 0;
    int firstPrime = 0;

      System.out.print("\nEnter any integer n >> ");
    int integerN = input.nextInt();
    
    while (primeFactors <= integerN) {
      if (integerN / primeFactors != integerN && integerN % primeFactors == 0) {
        firstPrime = primeFactors;
      nextMultiple = integerN / firstPrime;
      System.out.print(nextMultiple);
   
      }
         primeFactors++; 
      }

          

  }
}
