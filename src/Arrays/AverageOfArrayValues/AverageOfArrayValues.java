import java.util.Arrays;
public class AverageOfArrayValues {
	public static void main(String...args) {
	
	int average = 0;
	int sum = 0;
	
	int[] arrayOfValues = {10, 11, 12, 13, 14};
	
	for (int numbers = 0; numbers < arrayOfValues.length; numbers++) {
		sum += arrayOfValues[numbers];
	}
	average += sum / arrayOfValues.length;
		System.out.println("\nThe average of the values of an array: " + Arrays.toString(arrayOfValues) + " is " + average);
	}
}
