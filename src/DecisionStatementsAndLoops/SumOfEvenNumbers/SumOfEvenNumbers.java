import java.util.Scanner;

public class SumOfEvenNumbers {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter first integer:  ");
    int first_integer = input.nextInt();
    
    int second_integer;
    do {
    System.out.print("\nEnter second integer(must be greater than the first): ");
    second_integer = input.nextInt();
    
    if (second_integer <= first_integer) System.out.println("\nSecond integer must be greater than the first!");
    } while (second_integer <= first_integer);
    
    for (int numbers = first_integer; numbers <= second_integer; numbers++) {
      if (numbers % 2 == 0) sum += numbers;
      }
    System.out.printf("%nThe sum of all even numbers between %d and %d is %d.%n", first_integer, second_integer, sum);
  }
}
