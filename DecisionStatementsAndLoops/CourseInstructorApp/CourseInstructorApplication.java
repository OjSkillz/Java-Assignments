import java.util.Scanner;

public class CourseInstructorApplication {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("""
                  \nType 1, 2 or 3 to select your course: 
                      1. Math
                      2. Science
                      3. History
      """);
  int course = input.nextInt();

  System.out.print("""
                  \nType 1, 2, 3 or 4 to select your grade level: 
                      1. Freshman
                      2. Sophomore
                      3. Junior
                      4. Senior
      """);
  int gradeLevel = input.nextInt();
  
  switch (course) {
    case 1:
      switch (gradeLevel) {
      case 1: System.out.println("\nDear Freshman, your course instructor for Math is Dr. Sulley.");
      break;
      case 2: System.out.println("\nDear Sophomore, your course instructor for Math is Dr. Mandy.");
      break;
      case 3: System.out.println("\nDear Junior, your course instructor for Math is Dr. John");
      break;
      case 4: System.out.println("\nDear Senior, your course instructor for Math is Prof. Wigglesworth");
      break;
    default: System.out.println("\nYou do not have a place in our college this year, try again the next!");
    }
  break;
  case 2: 
     switch (gradeLevel) {
      case 1: System.out.println("\nDear Freshman, your course instructor for Science is Dr. Moore.");
      break;
      case 2: System.out.println("\nDear Sophomore, your course instructor for Science is Dr. Rudolph.");
      break;
      case 3: System.out.println("\nDear Junior, your course instructor for Science is Dr. Ticketer");
      break;
      case 4: System.out.println("\nDear Senior, your course instructor for Science is Prof. Jamal");
      break;
    default: System.out.println("\nYou do not have a place in our college this year, try again the next!");
    }
  break;
  case 3: 
     switch (gradeLevel) {
      case 1: System.out.println("\nDear Freshman, your course instructor for History is Dr. Jennifer.");
      break;
      case 2: System.out.println("\nDear Sophomore, your course instructor for History is Dr. Lakeside.");
      break;
      case 3: System.out.println("\nDear Junior, your course instructor for History is Dr. Francis");
      break;
      case 4: System.out.println("\nDear Senior, your course instructor for History is Prof. Ednut");
      break;
    default: System.out.println("\nYou do not have a place in our college this year, try again the next!");
     }

    }
  
  }
}
