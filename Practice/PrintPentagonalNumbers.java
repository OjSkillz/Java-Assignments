public class PrintPentagonalNumbers{
  public static void main(String...args) {
    System.out.println("THe first 100 pentagonal numbers are : ");
    printFirstNPentagonalNumbers(100);
  }
  public static int getPentagonalNumber(int n) {
    int pentagonalNumber = n * ((3*n) - 1) / 2;
    return pentagonalNumber;
  }
  public static void printFirstNPentagonalNumbers(int number) {
    final int NUMBERS_PER_LINE = 10;
    int NUMBERS_COUNTER = 0;
    for (int n = 1; n <= number; n++) {
      System.out.print(getPentagonalNumber(n) + " ");
      NUMBERS_COUNTER++;
      if (NUMBERS_COUNTER % NUMBERS_PER_LINE == 0) System.out.println();      
    }  
  }
}
