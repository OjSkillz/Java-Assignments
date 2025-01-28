import java.util.Scanner;

public class MinimumRunwayLength {
    public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the velocity in m/s: \n");
	double velocity = input.nextDouble();

	System.out.print("Enter the acceleration in m/s2: \n");
	double acceleration = input.nextDouble();

	double length = Math.pow(velocity, 2) / (2 * acceleration);
	
	System.out.printf("The minimum runway length is %.2fm%n", length);

}
}