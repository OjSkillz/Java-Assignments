package ClassExercises;

public class TaskFive {
  public static void main(String[] args) {
  
printCopiesOf(4);
System.out.print(" ");
printCopiesOf(8);
  }
  public static void printNumber(int number) {
    System.out.print(number);

  }
  public static void printCopiesOf(int integer) {
    for (int j = 1; j <= 5; j++) {
      printNumber(integer);
  }
  }
  
}
