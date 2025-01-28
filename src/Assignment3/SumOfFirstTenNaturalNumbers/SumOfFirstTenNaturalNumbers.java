
public class SumOfFirstTenNaturalNumbers {
  public static void main(String[] args) {
  
  int naturalNumber = 1;
  int sum = 1;
  
    while (naturalNumber < 10) {
    naturalNumber++;
    sum = sum + naturalNumber;
    }
  System.out.println("\nThe sum of the first ten natural numbers is:  " + sum);
  }
}

