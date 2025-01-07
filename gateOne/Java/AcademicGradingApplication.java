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
    while (teacherTitle != 1 && teacherTitle != 2 && teacherTitle != 3 ) {
    System.out.println("Invalid selection! Select between 1 and 3");
    System.out.print("""
            Enter 1️⃣  for Mr
            Enter 2️⃣  for Mrs
            Enter 3️⃣  for Miss 
            >>>  """);
    teacherTitle = input.nextInt();
    }
    
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
  
  
  int[] positions = new int[numberOfStudents];
  for (int index = 0; index < numberOfStudents; index++) {
    positions[index] = index + 1;
    }
      
  int[] positionsReversed = new int[positions.length];
  for (int index = positions.length -1, index1 = 0; index >= 0; index--, index1++) {
  positionsReversed[index1] = positions[index];
  }
  float[] newTotals = new float[totals.length];
  for(int index = 0; index < totals.length; index++) newTotals[index] = totals[index];
  Arrays.sort(newTotals);
  
  printBreaker();
  System.out.print("STUDENT\t\t");
  for (int index = 0; index < numberOfSubjects; index++) 
  System.out.print(subjects[index] + "\t");
  System.out.println("TOT\tAVE\tPOS");
  printBreaker();
    
  for (int row = 0; row < numberOfStudents; row++){
  System.out.print(students[row] + "\t");
    for(int column = 0; column < numberOfSubjects; column++)
      System.out.print(scoresPerStudent[row][column] + "\t\t"); 
      System.out.printf("%.0f\t%.2f\t", totals[row] , (totals[row] / numberOfSubjects));
    for (int index = 0; index< totals.length; index++){
        if (totals[row] == newTotals[index]) System.out.println(positionsReversed[index]);
      }
    }

   printBreaker();
   printBreaker();
 final int CUT_OFF_MARK = 40;
 
 int[] fails= new int [numberOfSubjects];
 int[] passes = new int [numberOfSubjects];
 
 for(int column = 0; column < numberOfSubjects; column++) {
 int numberOfFails = 0;
 int numberOfPasses = 0;
  for (int row = 0; row < numberOfStudents; row++) {
      if (scoresPerStudent[row][column] >= CUT_OFF_MARK) numberOfPasses ++;
      else numberOfFails ++;
  }
  fails[column]= numberOfFails;
  passes[column] = numberOfPasses;
  }

 
 System.out.println("SUBJECT SUMMARY");
 
int maxPass = passes[0];
int maxFail = fails[0];
String hardestSubject = subjects[0];
String easiestSubject = subjects[0];

 for (int row = 0, row1 = 0; row < numberOfSubjects && row1 < numberOfStudents; row1++, row++){
 System.out.println(subjects[row]);
 
 int highestScorePerSubject = scoresPerStudent[0][row];
 String highestStudent = students[0];
 float total = 0;
 
 for (int column = 0; column < numberOfStudents; column++) {
 total += scoresPerStudent[column][row1];
 if (scoresPerStudent[column][row1] > highestScorePerSubject) {
 highestScorePerSubject = scoresPerStudent[column][row1] ;
  highestStudent = students[column];
 }
 } 
  String lowestStudent = students[0];
 int lowestScorePerSubject = scoresPerStudent[0][row];
 for (int column = 0; column < numberOfStudents ; column++) {
 if (scoresPerStudent[column][row1] < lowestScorePerSubject) {
 lowestScorePerSubject = scoresPerStudent[column][row1] ;
 lowestStudent = students[column];
 } 

} 
 System.out.printf("Highest Scoring Student is : %s scoring %d%n" , highestStudent ,  highestScorePerSubject);
System.out.printf("Lowest Scoring Student is : %s scoring %d%n" , lowestStudent ,  lowestScorePerSubject);
System.out.printf("Total Score is : %.0f%n", total);
System.out.printf("Average Score is : %.2f%n", total/numberOfStudents);
System.out.printf("Number of Passes : %d%n", passes[row]);
System.out.printf("Number of Fails : %d%n", fails[row]);
System.out.println();

if (passes[row] > maxPass) {
maxPass = passes[row];
easiestSubject = subjects[row];
}

if (fails[row] > maxFail) {
maxFail = fails[row];
hardestSubject = subjects[row];
}

 }
 System.out.printf("The easiest subject is %s with %d passes%n", easiestSubject, maxPass);
System.out.printf("The hardest subject is %s with %d failures%n", hardestSubject, maxFail);

int overallHighestScore = scoresPerStudent[0][0] , overallLowestScore = scoresPerStudent[0][0];
String highestScoringStudent = students[0] , lowestScoringStudent = students[0];
String highestScoringSubject = subjects[0] , lowestScoringSubject = subjects[0];

for (int row = 0; row < students.length; row++) {
  for(int column = 0; column < subjects.length; column++) {
    if (scoresPerStudent[row][column] > overallHighestScore) {
    overallHighestScore = scoresPerStudent[row][column];
    highestScoringStudent = students[row];
    highestScoringSubject = subjects[column];
    }
    if (scoresPerStudent[row][column] < overallLowestScore) {
    overallLowestScore = scoresPerStudent[row][column];
    lowestScoringStudent = students[row];
    lowestScoringSubject = subjects[column];
    }
  }
}
System.out.printf("The overall Highest score is scored by %s in %s scoring %d%n", highestScoringStudent, highestScoringSubject, overallHighestScore);

System.out.printf("The overall Lowest score is scored by %s in %s scoring %d%n", lowestScoringStudent, lowestScoringSubject, overallLowestScore);

  printBreaker();
  
 float maxTotal = totals[0];
 float minTotal = totals[0];
 float classTotal = 0;
 String bestStudent = students[0], worstStudent = students[0];
 for (int index = 0; index < totals.length; index++) {
  if (totals[index] > maxTotal) {
  maxTotal = totals[index];
  bestStudent = students[index]; 
  }
  if (totals[index] < minTotal) {
 minTotal = totals[index];
  worstStudent = students[index]; 
  }
  classTotal += totals[index];
 }
 System.out.println("CLASS SUMMARY");

  printBreaker();
  System.out.printf("Best Graduating Student is :  %s scoring %.0f%n", bestStudent, maxTotal);
  printBreaker();
    
  System.out.println();
  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  System.out.printf("Worst Graduating Student is :  %s scoring %.0f%n", worstStudent, minTotal);
  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  
  System.out.println();
    
  printBreaker();
      
  System.out.printf("Class total score is: %.0f%nClass Average score is: %.2f%n", classTotal, classTotal / numberOfStudents);
    
  printBreaker();
    
  switch (teacherTitle) {
  case 1:  System.out.printf("You have come to the end of this grading exercise, Mr %s.%n", teacherName);
  break;
 
  case 2: System.out.printf("You have come to the end of this grading exercise, Mrs %s.%n", teacherName);
  break;
  
 case 3: System.out.printf("You have come to the end of this grading exercise, Miss %s.%n", teacherName);
 break;
  }
  printBreaker();
  }
  public static void printBreaker() {
    for (int count = 0; count < 100; count++) 
      System.out.print("=");
    System.out.println();
 }
}
