import java.util.Scanner;

public class QuadraticEquationSolver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nEnter the coefficients a, b and c of the quadratic equation: ");
    System.out.print("\na: ");
    double a = input.nextDouble();
    System.out.print("b: ");
    double b = input.nextDouble();
    System.out.print("c: ");
    double c = input.nextDouble();
    
    final double DETERMINANT = Math.pow(b, 2) - (4 * a * c);
        
    if (a != 0) {
      if (DETERMINANT > 0){
        double firstRoot = (-b + Math.pow(DETERMINANT, 0.5)) / (2 * a);
        double secondRoot = (-b - Math.pow(DETERMINANT, 0.5)) / (2 * a);
        System.out.println("\nThe roots are " + firstRoot + " and " + secondRoot);
        
      } else if (DETERMINANT < 0) {
          double realRoot = -b  / (2 * a);
          double imaginaryRoot = (Math.pow(-DETERMINANT, 0.5)) / (2 * a);
          
          System.out.println("\nThe roots are " + realRoot + "i" + " and " +
          imaginaryRoot + "j");          
          
        } else {
            double sameRoot = -b  / (2 * a);
            System.out.println("\nThe roots are same: " + sameRoot); 
          } 
    }        
    else 
      System.out.println("You have entered an invalid input for a");
  }
}
