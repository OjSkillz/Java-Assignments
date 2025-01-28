package TrianglePrintingFunction;

import java.util.Scanner;


public class TwoTriangles{
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your desired base length >> ");
    int baseLength = input.nextInt();
    
    System.out.println("Good. Here's your asterisk-patterned triangle  ⏬\n");
  
    printTwoTriangles(baseLength);
    
  }
  public static void printStar() {
      System.out.print("* ");
    } 
  public static void printNewLine() {
  
  System.out.println();
  }
  public static void printStar(int numberOfStars) {
   for (int index = numberOfStars; index >= 1; index--) {
        printStar();
   }
  }
  public static void printLowerTriangle(int numberOfStars) {
    for (int index = numberOfStars; index >= 1; index--) {
       printStar(index);
       printNewLine();
    }
  }
    public static void printTwoTriangles(int baseLength) {
       printUpperTriangle(baseLength);
       printLowerTriangle(baseLength);
    }
  public static void printUpperTriangle(int baseLength) {
      int index = 1;
    String asterisk = "* ";
    
    while (index <= baseLength) {
    System.out.print(asterisk);
    printNewLine();
    asterisk = asterisk + "* ";
    index ++;
    }   
  
  }
  
}
