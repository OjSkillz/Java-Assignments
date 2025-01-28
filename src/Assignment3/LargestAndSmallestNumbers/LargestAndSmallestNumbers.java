import java.util.Scanner;

public class LargestAndSmallestNumbers {
  public static void main(String[] args) {
    
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nEnter as many numbers as you want and enter \"-1\"" + 
      " to stop: ");
    int userNumber = input.nextInt();
    int largestNumber = userNumber;
    int smallestNumber = userNumber;
      
    while (userNumber != -1) {
        userNumber = input.nextInt();
        if (userNumber > largestNumber && userNumber !=1) { 
        largestNumber = userNumber;
        }
          else if (userNumber < smallestNumber && userNumber != -1) {
          smallestNumber = userNumber;
          }
       } 
        System.out.println("The largest number is " + largestNumber + " and " + 
        "The smallest number is " + smallestNumber); 
  }
}
