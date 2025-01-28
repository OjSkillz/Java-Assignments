import java.util.Arrays;

public class ExtractingDigits {
  public static void main(String...args) {
    int number = 2342;
    
    System.out.println(extractDigitsToList(number));
  
  }
  public static int[] extractDigitsToList(int number) {
  
    int[] numbers = new int[(String.valueOf(number)).length()];
    
    int index = 0;
    while (number > 0) {
      index++;
      int digits = number % 10;
      number = number / 10;
     numbers[index] = digits;
    }
    return numbers;
  }
}
