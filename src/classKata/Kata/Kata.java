import java.util.Scanner;

public class Kata {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer >> ");
    int integer = input.nextInt();
    
    System.out.println(isPalindrome(integer));
  }
  public static boolean isEven(int integer) {
  final int divisor = 2;
  if (integer % divisor == 0) return true;
  return false;
  }
  
  public static boolean isPrimeNumber(int integer) {
    boolean check = false;
    if (integer == 2) check = true;
    for (int number = 2; number < integer; number++) {
      if (integer % number != 0) check = true; break;
    } return check;
  }
  
  public static int subtract(int integerOne, int integerTwo) {
    return Math.abs(integerOne - integerTwo);
  }
  
  public static float divide(int integerOne, int integerTwo) {
    float quotient = 0;
    if (integerTwo == 0) return quotient;
    quotient = integerOne / integerTwo;
    return quotient;
  }
  
  public static boolean isSquare(int integer) {
    int root = (int)Math.sqrt(integer);
    if (root ==   integer / root) return true;
    return false;
  }
   public static boolean isPalindrome(int integer) {
    boolean check = true;
    int length = String.valueOf(integer).length();
    int[] numbers = new int[length];
    int index = 0;
    while (integer > 0 && index < String.valueOf(integer).length()) {
    int digit = integer % 10;
     numbers[index] = digit;
     integer = integer / 10;
      index++;
      }
      for (int count = 0, counter = numbers.length - 1; count < numbers.length; count++, counter--) {
        if (numbers[count] != numbers[counter]) check = false; 
      } 
      return check;
      }
}
