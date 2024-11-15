import java.util.Scanner;

public class MbtiApplication {
  public static void main(String...args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("\nHi! , this is the Meyer-Briggs Personality Test. What is your name?  ");
    String name = input.nextLine();
     
    String[][] testQuestions = { 
    {"A - Expend energy, enjoy groups" , "B - Conserve energy, enjoy one-on-one"}, 
    {"A - Interpret literally", "B - Look for meaning and possibilities"},
    {"A - Logical, thinking, questioning" , "B - Empathetic, feeling, accommodating"},
    {"A - Organized, orderly" ,  "B - Flexible, adaptable"},
    {"A - More outgoing, think out loud" , "B - More reserved, think to yourself"},
    {"A - Practical, realistic, experential" , "B - Imaginative, innovative, theoretical"},
    {"A - Candid, straight forward, frank" ,  "B - Tactful, kind, encouraging"},
    {"A - Plan, schedule" , "B - Unplanned, spontaneous"},
    {"A - Seek many tasks, public activities, interaction with others" , "B - Seek private, solitary activities with quiet to" +
    " concentrate"},
    {"A - Standard, usual, conventional", "B - Different, novel, unique"},
    {"A - Firm, tend to criticize, hold the line", "B - Gentle, tend to appreciate, conciliate"},
    {"A - Regulated, structured" ,"B - Easygoing, \"live\" and \"let live\""},
    {"A - External, communicative, express yourself" , "B - Internal, reticent, keep to yourself"},
    {"A - Focus on here-and-now" , "B - Look to the future, global perspective, \"big picture\""},
    {"A - tough-minded, just" , "B - Tender-hearted, merciful"},
    {"A - Preparation, plan ahead" , "B - Go with the flow, adapt as you go"},
    {"A - Active, initiate" , "B - Reflective, deliberate"},
    {"A - Facts, things, \"what is\"" , "B - Ideas, dreams, \"what could be\", philosophical"},
    {"A - Matter of fact, issue-oriented" , "B - Sensitive, people-oriented, compassionate"},
    {"A - Control, govern" , "B - Latitude, freedom"},
    
    };
    String[] outputs = new String[21];
    
    int extroverted = 0 , introverted = 0, sensing = 0 , intuitive = 0,  judging = 0, perceptive = 0, thinking = 0, feeling = 0 ;
    String userResponse;
    do {
    System.out.println("\nReady " + name + " ? Select A or B from each of the following 20 personality tests:");

    for (int index = 0; index < testQuestions.length; index += 4){
      System.out.print("\n" + testQuestions[index][0] + "\t" + testQuestions[index][1] + " : ");
      
      String responseEvsI = input.nextLine();
      
      if (responseEvsI.equalsIgnoreCase("A")) {
      outputs[index] = testQuestions[index][0];
      extroverted++;
      }
      else if (responseEvsI.equalsIgnoreCase( "B")) {
      outputs[index] = testQuestions[index][1];
      introverted ++;
      }
      else {
      System.out.println("\nExpected A or B. Try again :");
      index+= -4;
      }
      }
      for (int index = 1; index < testQuestions.length; index += 4){
      System.out.print("\n" + testQuestions[index][0] + "\t" + testQuestions[index][1] + " : ");
      String responseSvsN = input.nextLine();
      
      if (responseSvsN.equalsIgnoreCase("A")) {
      outputs[index] = testQuestions[index][0];
      sensing++;
      }
      else if (responseSvsN.equalsIgnoreCase( "B")) {
      outputs[index] = testQuestions[index][1]; 
      intuitive++;
      }
      else {
      System.out.println("\nExpected A or B. Try again :");
      index+= -4;
      }
      }
      for (int index = 2; index < testQuestions.length; index += 4){
      System.out.print("\n" + testQuestions[index][0] + "\t" + testQuestions[index][1] + " : ");
      String responseTvsF = input.nextLine();
      
      if (responseTvsF.equalsIgnoreCase("A")) {
      outputs[index] = testQuestions[index][0];
      thinking++;
      }
      else if (responseTvsF.equalsIgnoreCase( "B")) {
      outputs[index] = testQuestions[index][1];
      feeling++;
      }
      else {
      System.out.println("\nExpected A or B. Try again :");
      index+= -4;
      }
      }
      for (int index = 3; index < testQuestions.length; index += 4){
      System.out.print("\n" + testQuestions[index][0] + "\t" + testQuestions[index][1] + " : ");
      String responseJvsP = input.nextLine();
      
      if (responseJvsP.equalsIgnoreCase("A")) {
      outputs[index] = testQuestions[index][0];
      judging++;
      }
      else if (responseJvsP.equalsIgnoreCase( "B")) {
      outputs[index] = testQuestions[index][1];
      perceptive++;
      }
      else {
      System.out.println("\nExpected A or B. Try again :");
      index+= -4;
      } 
      }
      
      String extrovert = "E", introvert = "I", sense = "S", intuite = "N", think = "T", feel = "F", judge = "J", perceive = "P";
      String personality = "";
      
      System.out.println("\nHello " + name + ", You Selected:  ");
      
      for (int index = 0; index < outputs.length -1; index += 4) System.out.println("\n" + outputs[index]);
      System.out.println("\nNumber of A selected: " + extroverted + "\nNumber of B selected: " + introverted);
      System.out.println(extroverted > introverted ? "Extroverted (E) vs Introverted (I) : "+ extrovert : "Extroverted (E) vs" +
      " Introverted (I) : " + introvert);
      if (extroverted > introverted) personality += "E";
      else personality += "I";
      
       for (int index = 1; index < outputs.length -1; index += 4) System.out.println("\n" + outputs[index]);
      System.out.println("\nNumber of A selected: " + sensing + "\nNumber of B selected: " + intuitive);
      System.out.println(sensing > intuitive ? "Sensing (S) vs Intuitive (N) : " + sense : "Sensing (S) vs Intuitive (N) : "+
      intuite);
      if (sensing > intuitive) personality += "S";
      else personality += "N";
      
      for (int index = 2; index < outputs.length -1; index += 4) System.out.println("\n" + outputs[index]);
      System.out.println("\nNumber of A selected: " + thinking + "\nNumber of B selected: " + feeling);
      System.out.println(thinking > feeling ? "Thinking (T) vs Feeling (F) : " + think : "Thinking (T) vs Feeling (F) : " + feel);
      if (thinking > feeling) personality += "T";
      else personality += "F";
      
       for (int index = 3; index < outputs.length -1; index += 4) System.out.println("\n" + outputs[index]);
      System.out.println("\nNumber of A selected: " + judging + "\nNumber of B selected: " + perceptive);
      System.out.println(judging > perceptive ? "Judging (J) vs Perceptive (P) : " + judge :  "Judging (J) vs Perceptive (P) :" +
      " " + perceive);
      if (judging > perceptive) personality += "J";
      else personality += "P";
      
      System.out.println("\nBased on all of your selections, your personality combination is " + personality);
      
      System.out.println("\nHere's what the personality type " + personality + " means : "); 
      
        switch (personality) {
        case "ISTJ": 
                              System.out.println("""
                                                         \n 
                                                          ISTJ
                                                          
                                                          Responsible Realist (MBTI)
                                                          Logistician (16Personalities)
                                                          
                                                          The  ISTJ Personality Type
                                                          
                                                          Quiet, serious, earn success by being thorough and dependable. Practical, matter-of-fact, realistic, and
                                                          responsible. Decide logically what should be done and work toward it steadily, regardless of distractions. 
                                                          Take pleasure in making everything orderly and organized—their work, their home, their life. 
                                                          Value traditions and loyalty.

                                                            """); 
      break;
      case "ISFJ":
                                System.out.println(""" 
                                                        \n 
                                                          ISFJ
                                                          
                                                          Practical Helper (MBTI)
                                                          Defender (16Personalities)
                                                          
                                                          The ISFJ Personality Type

                                                          Quiet, friendly, responsible, and conscientious. Committed and steady in meeting their obligations.
                                                          Thorough, painstaking, and accurate. Loyal, considerate, notice and remember specifics about people
                                                          who are important to them, concerned with how others feel. Strive to create an orderly and harmonious
                                                          environment at work and at home.

                                                                  """); 
      break;
       case "INFJ":
                                System.out.println(""" 
                                                          \n 
                                                          INFJ
                                                          
                                                          Insightful Visionary (MBTI)
                                                          Advocate (16Personalities)
                                                          
                                                          The INFJ Personality Type

                                                          Seek meaning and connection in ideas, relationships, and material possessions. Want to understand 
                                                          what motivates people and are insightful about others. Conscientious and committed to their firm values. 
                                                          Develop a clear vision about how best to serve the common good. Organized and decisive in implementing
                                                          their vision.
                                
                                                                         """); 
      break;
      case "INTJ":
                              System.out.println(""" 
                                                          \n 
                                                          INTJ
                                                          
                                                          Conceptual Planner (MBTI)
                                                          Architect (16Personalities)
                                                          
                                                          The INTJ Personality Type

                                                          Have original minds and great drive for implementing their ideas and achieving their goals. 
                                                          Quickly see patterns in external events and develop long-range explanatory perspectives. When
                                                          committed, organize a job and carry it through. Skeptical and independent, have high standards of 
                                                          competence and performance—for themselves and others.
                                
                                                                      """); 
    break;
    case "ISTP":
                              System.out.println(""" 
                                                            \n 
                                                            ISTP
                                                            
                                                            Logical Pragmatist (MBTI)
                                                            Virtuoso (16Personalities)
                                                            
                                                            The ISTP Personality Type


                                                            Tolerant and flexible, quiet observers until a problem appears, then act quickly to find workable
                                                            solutions. 
                                                            Analyze what makes things work and readily get through large amounts of data to isolate the core of
                                                            practical problems. Interested in cause and effect, organize facts using logical principles, value efficiency.
                              
                                                                      """); 
    break;
     case "ISFP":
                                System.out.println(""" 
                                                              \n 
                                                              ISFP
                                                              
                                                              Versatile Supporter (MBTI)
                                                              Adventurer (16Personalities)
                                                              
                                                              The ISFP Personality Type

                                                              Quiet, friendly, sensitive, and kind. Enjoy the present moment, what's going on around them. Like to
                                                              have their own space and to work within their own time frame. Loyal and committed to their values and 
                                                              to people who are important to them. Dislike disagreements and conflicts; don't force their opinions or values on others.
                                    
                                                                """); 
    break;
    case "INFP":
                                System.out.println(""" 
                                                               \n 
                                                                INFP
                                                                
                                                                Thoughtful Idealist (MBTI)
                                                                Mediator (16Personalities)
                                                                
                                                                The INFP Personality Type

                                                                Idealistic, loyal to their values and to people who are important to them. Want to live a life that is 
                                                                congruent with their values. Curious, quick to see possibilities, can be catalysts for implementing ideas. 
                                                                Seek to understand people and to help them fulfill their potential. Adaptable, flexible, and accepting unless a value is threatened.
                                  
                                  """); 
    break;
     case "INTP": 
                                System.out.println(""" 
                                                                \n 
                                                                INTP
                                                                
                                                                Objective Analyst (MBTI)
                                                                Logician (16Personalities)
                                                                
                                                                The INTP Personality Type

                                                                Seek to develop logical explanations for everything that interests them. Theoretical and abstract,
                                                                interested more in ideas than in social interaction. Quiet, contained, flexible, and adaptable. 
                                                                Have unusual ability to focus in depth to solve problems in their area of interest. Skeptical, sometimes critical, always analytical.
                                
                                                                   """); 
    break;
     case "ESTP":
                                  System.out.println(""" 
                                                                    \n 
                                                                    ESTP
                                                                    
                                                                    Energetic Problem-Solver (MBTI)
                                                                    Entrepreneur (16Personalities)
                                                                    
                                                                    The ESTP Personality Type

                                                                    Flexible and tolerant, take a pragmatic approach focused on immediate results. Bored by theories and
                                                                    conceptual explanations; want to act energetically to solve the problem. 
                                                                    Focus on the here and now, spontaneous, enjoy each moment they can be active with others. Enjoy
                                                                    material comforts and style. Learn best through doing.
                                                                        """); 
    
    break;
    case "ESFP":
                                System.out.println(""" 
                                                                    \n 
                                                                    ESFP
                                                                    
                                                                    Enthusiastic Improviser (MBTI)
                                                                    Entertainer (16Personalities)
                                                                    
                                                                    The ESFP Personality Type

                                                                    Outgoing, friendly, and accepting. Exuberant lovers of life, people, and material comforts. 
                                                                    Enjoy working with others to make things happen. Bring common sense and a realistic approach to
                                                                    their work and make work fun. Flexible and spontaneous, adapt readily to new people and
                                                                    environments. Learn best by trying a new skill with other people.
                                                                  
                                                                    """); 

     break;
     case "ENFP":
                                  System.out.println(""" 
                                                                      \n 
                                                                      ENFP
                                                                      
                                                                      Imaginative Motivator (MBTI)
                                                                      Campaigner (16Personalities)
                                                                      
                                                                      The ENFP Personality Type

                                                                      Warmly enthusiastic and imaginative. See life as full of possibilities. Make connections between
                                                                      events and information very quickly, and confidently proceed based on the patterns they see. 
                                                                      Want a lot of affirmation from others, and readily give appreciation and support. Spontaneous and
                                                                      flexible, often rely on their ability to improvise and their verbal fluency.
                                                                      
                                                                      """); 

    break;
    case "ENTP":
                                  System.out.println(""" 
                                                                      \n 
                                                                      ENTP
                                                                      
                                                                      Enterprising Explorer (MBTI)
                                                                      Debater (16Personalities)
                                                                      
                                                                      The ENTP Personality Type

                                                                      Quick, ingenious, stimulating, alert, and outspoken. Resourceful in solving new and challenging
                                                                      problems. Adept at generating conceptual possibilities and then analyzing them strategically. 
                                                                      Good at reading other people. Bored by routine, will seldom do the same thing the same way, apt to
                                                                      turn to one new interest after another.
                                                                      
                                                                      """); 
    
    break;
    case "ESTJ":
                                  System.out.println(""" 
                                                                      \n 
                                                                      ESTJ
                                                                      
                                                                      Efficient Organizer (MBTI)
                                                                      Executive (16Personalities)
                                                                      
                                                                      The ESTJ Personality Type

                                                                      Practical, realistic, matter-of-fact. Decisive, quickly move to implement decisions. Organize 
                                                                      projects and people to get things done, focus on getting results in the most efficient way possible. 
                                                                      
                                                                      Take care of routine details. Have a clear set of logical standards, systematically follow them and
                                                                      want others to also. Forceful in implementing their plans.
                                                                      
                                                                      """); 

      break;
      case "ESFJ":
                                  System.out.println(""" 
                                                                      \n 
                                                                      ESFJ
                                                                      
                                                                      Supportive Contributor (MBTI)
                                                                      Consul (16Personalities)
                                                                      
                                                                      The ESFJ Personality Type

                                                                      Warmhearted, conscientious, and cooperative. Want harmony in their environment, work with
                                                                      determination to establish it. Like to work with others to complete tasks accurately and on time. 
                                                                      Loyal, follow through even in small matters. Notice what others need in their day-to-day lives and 
                                                                      try to provide it. Want to be appreciated for who they are and for what they contribute.
                                                                      
                                                                      """); 
      break;
      case "ENFJ":
                                    System.out.println(""" 
                                                                        \n 
                                                                        ENFJ
                                                                        
                                                                        Compassionate Facilitator (MBTI)
                                                                        Protagonist (16Personalities)
                                                                        
                                                                        The ENFJ Personality Type

                                                                        Warm, empathetic, responsive, and responsible. Highly attuned to the emotions, needs, and
                                                                        motivations of others. Find potential in everyone, want to help others fulfill their potential. 
                                                                        May act as catalysts for individual and group growth. Loyal, responsive to praise and criticism.
                                                                        Sociable, facilitate others in a group, and provide inspiring leadership.
                                                                        
                                                                        """); 
      break;
      case "ENTJ":
                                    System.out.println(""" 
                                                                        \n 
                                                                        ENTJ
                                                                        
                                                                        Decisive Strategist (MBTI)
                                                                        Commander (16Personalities)
                                                                        
                                                                        The ENTJ Personality Type

                                                                        Frank, decisive, assume leadership readily. Quickly see illogical and inefficient procedures and
                                                                        policies, develop and implement comprehensive systems to solve organizational problems. 
                                                                        Enjoy long-term planning and goal setting. Usually well informed, well read, enjoy expanding 
                                                                        their knowledge and passing it on to others. Forceful in presenting their ideas.

                                                                        """);       
            } 
       
        System.out.print("\nDo you wish to take the test again? Type \"Yes\" or \"No\" :   ");
        userResponse = input.nextLine();
    } while (userResponse.equalsIgnoreCase("yes"));
      System.out.println("\nThanks for taking this test, cheers to an optimally productive life! 🎉");
  } 
}   
