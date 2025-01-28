import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class evenOrOddCounter{
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    List<Integer> inputs = new ArrayList();
    
    int endInput = -1;
    System.out.println("Enter a list of odd and even numbers (enter \"-1\" to stop) : ");
    int numbers = input.nextInt();
    inputs.add(numbers);
    while (numbers != endInput) {
      numbers = input.nextInt();
      inputs.add(numbers);
    }
    
    System.out.println(countOddOrEven(inputs));
  }
  
  
  public static List countOddOrEven(List<Integer> numbers) {
    List<Integer> evenAndOddCount = new ArrayList<Integer>();
    int evenCount = 0;
    int oddCount = 0;
    
    for (Integer number : numbers) {
      if (number % 2 == 0 && number >= 0 ) evenCount += 1;
      else if (number % 2 != 0 && number > 0) oddCount += 1;
      }
    evenAndOddCount.add(oddCount);
    evenAndOddCount.add(evenCount);
    return evenAndOddCount;
  }
}
