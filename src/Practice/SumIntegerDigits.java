package Practice;

import java.util.Scanner;

public class SumIntegerDigits {
  public static void main(String... args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter any integer to find the sum of its digits>>  ");
  long integer = input.nextLong();
  
  System.out.printf("%nThe sum of all the digits in %d is %d%n", integer, sumDigits(integer));
  }
  
  public static int sumDigits(long n) {
    int sumOfDigits = 0;
    while (n > 0) {
    long digit = (n % 10);
    n = n / 10;
    sumOfDigits+= digit;
    }
    return sumOfDigits;
  }
}
