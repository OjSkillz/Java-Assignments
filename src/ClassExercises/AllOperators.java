package ClassExercises;

public class AllOperators {
  public static void main(String[] args) {
   
   int age = 5;
   
   int height = 5;
   
   int weight = 10;
   
   int wealth = 30;
   
  if (age == height && weight == wealth){
      System.out.println("\nTrue");
  }   
  else System.out.println("False");
  
  if (age == height & weight == wealth) {
      System.out.println("True");
  }    
  else System.out.println("False");
  
  if (age == height || weight == wealth) {
    System.out.println("True");
  } 
  else System.out.println("False");
  
  if (age == height | weight == wealth){
    System.out.println("True");
  }  
  else System.out.println("False");
  
   if (age == height ^ weight == wealth){
    System.out.println("True");
  }  
  else System.out.println("False");
  
  }
}
