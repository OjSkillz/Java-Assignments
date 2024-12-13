import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

/*
Pseudocode for student grading application

Display Welcome Message
Prompt the teacher to enter their name
Read in the teacher's name
Prompt the teacher to enter their title
Read in the teacher's title
Prompt the teacher to enter the number of students
Read in the number of students
Prompt the teacher to enter the number of subjects
Read in the number of subjects
Prompt the teacher to enter the scores of each student per subject
Read in the scores of each student per subject 
If any score is lesser than 0 or greater than 100
	Print an error message
	Prompt the teacher to enter that score again
Compute the total scores per student
Compute the average scores per student
Compute the positions per student
Display the class summary 
**/

public class AcademicGradingApplication{
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to The Lagbaja Schools Student Grading Application🎓");
    
    System.out.print("Kindly provide your name >>  ");
    String teacherName = input.nextLine();
    
    System.out.print("""
            Kindly provide your title: 
            Enter 1️⃣  for Mr
            Enter 2️⃣  for Mrs
            Enter 3️⃣  for Miss 
            >>>  """);
    int teacherTitle = input.nextInt();
    
    System.out.print("How many students do you have? >> ");
    int numberOfStudents = input.nextInt();
    
    
    System.out.print("How many subjects do they each offer? >> ");
    int numberOfSubjects = input.nextInt();
   
    String[] students = new String[numberOfStudents];
    for (int index = 0; index < students.length; index++)
      students[index] = "Student " + (index + 1);

    
    String[] subjects = new String[numberOfSubjects];
    for(int index = 0; index < subjects.length; index++) 
    subjects[index] = "Subject " + (index + 1);
            
    int[][] scoresPerStudent = new int[numberOfStudents][numberOfSubjects];
    for (int count = 0; count < numberOfStudents; count++) {
    System.out.println("\nYou Are Now Entering Scores for Student " + (count + 1));
        for (int row = count, column = 0; column < numberOfSubjects ; column++) {
        System.out.print("\nEnter score for Subject " + (column + 1) + " >>  ");
        int score = input.nextInt();
        
        while (score < 0 || score > 100) {
        System.out.println("\nInvalid entry. Enter scores between 0 and 100");
        System.out.print("\nEnter score for Subject " +  (column + 1) + " >>  ");
        score = input.nextInt();
        }
        scoresPerStudent[row][column] = score;
        System.out.println("Saved Successfully");
        }
    }
    System.out.println("All results have been captured.");
    
        float [] totals = new float[numberOfStudents];
        for (int row = 0; row < totals.length; row++) {
        int total = 0;
          for (int column =  0; column < numberOfSubjects; column++) {
            total += scoresPerStudent[row][column];
            
          } totals[row] = total; 
      }
      
  float[] averages = new float[numberOfStudents];
  
  for(int index = 0; index < averages.length; index++)
  averages[index] = (totals[index] / numberOfSubjects);
  System.out.println("==============================================================================================");
 System.out.print("STUDENT\t\t");
 for (int index = 0; index < numberOfSubjects; index++) 
  System.out.print(subjects[index] + "\t");
  System.out.println("TOT\tAVE\tPOS");
  System.out.println("==============================================================================================");
  for (int row = 0; row < numberOfStudents; row++){
  System.out.print(students[row] + "\t");
    for(int column = 0; column < numberOfSubjects; column++)
      System.out.print(scoresPerStudent[row][column] + "\t\t"); 
      System.out.printf("%s\t%.2f%n", totals[row] , (totals[row] / numberOfSubjects));
 }
  
  }
  }
