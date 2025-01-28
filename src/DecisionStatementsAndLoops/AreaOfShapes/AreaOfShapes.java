import java.util.Scanner;


public class AreaOfShapes {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
   final double PI = 3.142;
   
    System.out.print("\nType in 1, 2 or 3 to choose your preferred shape (1.CIrcle, 2.Rectangle or 3. Triangle):  ");
    int shape = input.nextInt();
    
    switch (shape) {
    case 1 : System.out.print("""
    Would you like to specify the radius of the  circle?: 
    1. Yes
    2. No, use a random value
    """);
                                    int circle = input.nextInt();
                            
                                    switch (circle) {
                                    
                                    case 1: System.out.print("\nWhat is the radius of the circle?  "); 
                                                    double radius  = input.nextDouble();
                                                    
                                                    double areaOfCircle = PI * Math.pow(radius, 2);
                                                    
                                                    System.out.printf("%nThe area of the circle is %.2fm²%n" , areaOfCircle);
                                   break;
                                   
                                   case 2:  radius = Math.random() * 10;
                                   
                                                  double areaOfCircleRandom = PI * Math.pow(radius, 2);
                                                    
                                                    System.out.printf("%nWith a random value of %f for the radius, the area of the circle is " +
                                                    "%.2fm²%n" , radius, areaOfCircleRandom);
                                   break;
                                   }
    case 2 : System.out.print("""
    Would you like to specify the length and width of the  rectangle?: 
    1. Yes
    2. No, use random values
    """);
                                    int rectangle = input.nextInt();
                            
                                    switch (rectangle) {
                                    
                                    case 1: System.out.print("\nlength: "); 
                                                    double length  = input.nextDouble();
                                                    
                                                     System.out.print("\nwidth: "); 
                                                    double width  = input.nextDouble();
                                                    
                                                    double areaOfRectangle = length * width;
                                                    
                                                    System.out.printf("%nThe area of the rectangle is %.2fm²%n" , areaOfRectangle);
                                   break;
                                   
                                   case 2:  length = Math.random() * 10;
                                                    width = Math.random() * 10;
                                   
                                                  areaOfRectangle  = length * width;
                                                    
                                           System.out.printf("%nWith random values of %.2f for the length and %.2f for width, the area of the rectangle" +
                                           " is %.2fm²%n" , length, width, areaOfRectangle);
                                   break;
                                   }
case 3: System.out.print("""
    Would you like to specify the base and height of the  triangle?: 
    1. Yes
    2. No, use random values
    """);
                                    int triangle = input.nextInt();
                            
                                    switch (triangle) {
                                    
                                    case 1: System.out.print("\nbase: "); 
                                                    double base  = input.nextDouble();
                                                    
                                                     System.out.print("\nheight: "); 
                                                    double height  = input.nextDouble();
                                                    
                                                    double areaOfTriangle = 0.5 * base * height;
                                                    
                                                    System.out.printf("%nThe area of the triangle is %.2fm²%n" , areaOfTriangle);
                                   break;
                                   
                                   case 2:  base = Math.random() * 10;
                                                    height = Math.random() * 10;
                                   
                                                  areaOfTriangle = 0.5 * base * height;
                                                    
                                           System.out.printf("%nWith random values of %.2f for the base and %.2f for height, the area of the rectangle" +
                                           " is %.2fm²%n" , base, height, areaOfTriangle);
                                   break;
                                   }
    
    }
  
  }
}
