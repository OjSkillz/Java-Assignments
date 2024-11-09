import java.util.Scanner;

public class CompanyAssessment {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print(""" 
                                                  \nChoose your department from the following options: Type 1, 2 or 3
                                                  1: IT
                                                  2. HR
                                                  3. Finance
                                                  
                                                  """);
  int department = input.nextInt();

  switch (department) {
  case 1:   System.out.print(""" 
                                                  \nChoose your role from the following options: Type 1, 2 or 3
                                                  1: Manager
                                                  2. Analyst
                                                  3. Intern
                                                  
                                                  """);
                          int manager = input.nextInt();
                          switch (manager) {
                          case 1: System.out.println("\nDear IT Manager, well done 👍");
                          break;
                          case 2:  System.out.println("\nDear IT Analyst, well done 👍");
                          break;
                          case 3:  System.out.println("\nDear IT Intern, well done 👍");
                          break;
                          default : System.out.println("\nWhatcha doing exactly??! 🤔");
                          }
  break;
  case 2:   System.out.print(""" 
                                                  \nChoose your role from the following options: Type 1, 2 or 3
                                                  1: Manager
                                                  2. Analyst
                                                  3. Intern
                                                  
                                                  """);
                          int analyst = input.nextInt();
                          switch (analyst) {
                          case 1: System.out.println("\nDear HR Manager, well done 👍");
                          break;
                          case 2:  System.out.println("\nDear HR Analyst, well done 👍");
                          break;
                          case 3:  System.out.println("\nDear HR Intern, well done 👍");
                          break;
                          default : System.out.println("\nWhatcha doing exactly??! 🤔");
                          }
  break;
  case 3:   System.out.print(""" 
                                                  \nChoose your role from the following options: Type 1, 2 or 3
                                                  1: Manager
                                                  2. Analyst
                                                  3. Intern
                                                  
                                                  """);
                          int intern = input.nextInt();
                          switch (intern) {
                          case 1: System.out.println("\nDear Finance Manager, well done 👍");
                          break;
                          case 2:  System.out.println("\nDear Finance Analyst, well done 👍");
                          break;
                          case 3:  System.out.println("\nDear Anayst Intern, well done 👍");
                          break;
                          default : System.out.println("\nWhatcha doing exactly??! 🤔");
                          }
  break;
  default : System.out.println("\nWhatcha doing exactly??! 🤔");
  
}
  }
}
