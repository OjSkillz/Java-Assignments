import java.util.Scanner;

public class AreaOfPolygon {
   public static void main(String[] args) {
     
	Scanner input = new Scanner(System.in);
	
	System.out.print("\n Input the number of sides on the polygon: ");

	double numberOfSides = input.nextDouble();

	System.out.print("\n Input the length of one of the sides: ");
	
	double lenghtOfOneSide = input.nextDouble();

	double areaOfPolygon = (numberOfSides * Math.pow(lenghtOfOneSide, 2)) / (4 * Math.tan(3.141592654/numberOfSides));

	System.out.printf("%n The area is: %f%n", areaOfPolygon);

	



   }
}