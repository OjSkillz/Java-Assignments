package NokiaMenu;

import java.util.Scanner;

public class NokiaMenuUpdate {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);

  System.out.print("\nNokia Menu\nSelect one: ");
  System.out.println("""
          
          1. Phone book
          2. Messages
          3. Chat
          4. Call register
          5. Tones
          6. Settings
          7. Call divert
          8. Games
          9. Calculator
          10.Reminders
          11. Clock
          12. Profiles
          13. SIM services
          """);

  int userChoice = input.nextInt();
  
  switch (userChoice) {
  case 1: 
    System.out.println("""
                          \n
                          1. Search
                          2. Service Nos.
                          3. Add name
                          4. Erase
                          5. Edit
                          6. Assign tone
                          7. Send b’card
                          8. Options
                          9. Speed dials
                          10. Voice tags
                          11. Back to previous menu
                          """);
        int phoneBook = input.nextInt();
    
        switch (phoneBook) {
    
        case 1: System.out.print("\nSearch\n");
        break;
        case 2: System.out.print("\nService Nos.\n");
        break;
        case 3: System.out.print("\nAdd name\n");
        break;
        case 4: System.out.print("\nErase\n");
        break;
        case 5: System.out.print("\nEdit\n");
        break;
        case 6: System.out.print("\nAssign tone\n");
        break;
        case 7: System.out.print("\nSend b'card\n");
        break;
        case 8: 
            System.out.println("""
                          \n
                          1. Type of view
                          2. Memory status
                          3. Back to previous menu
                          """);
            int options = input.nextInt();
            switch (options) {
        
            case 1: System.out.print("\nType of view\n");
            break;
            case 2: System.out.print("\nMemory Status\n");
            break;
            
            }
          }  
  break;
  case 2: 
     System.out.println("""
                            \n
                            1. Write messages
                            2. Inbox
                            3. Outbox
                            4. Picture messages
                            5. Templates
                            6. Smileys
                            7. Message settings
                            8. Info service
                            9. Voice mailbox number
                            10.Service command editor
                            """);
  
          int messages = input.nextInt();
          
          switch (messages) {
          
          case 1: System.out.print("\nWrite Messages\n");
          break;
          case 2: System.out.print("\nInbox\n");
          break;
          case 3: System.out.print("\nOutbox\n");
          break;
          case 4: System.out.print("\nPicture Messages\n");
          break;
          case 5: System.out.print("\nTemplates\n");
          break;
          case 6: System.out.print("\nSmileys\n");
          break;
          case 7: System.out.println("\n1. Set 1\n2. Common\n");
          
                int messageSettings = input.nextInt();
          
                switch (messageSettings) {
                
                case 1: System.out.println("""
                              \n
                              1. Message centre number
                              2. Message sent as
                              3. Message validity
                          """);
                          int setOne = input.nextInt();
                          switch (setOne) {
                          
                          case 1: System.out.print("\nMessage centre number\n");
                          break;
                          case 2: System.out.print("\nMessage sent as\n");
                          break;
                          case 3: System.out.print("\nMessage validity\n");
                          break;
                          }
                break;
                
                case 2: System.out.println("""
                              \n
                              1. Delivery reports
                              2. Reply via same centre
                              3. Character support
                          """);
                          int common = input.nextInt();
                          switch (common) {
                          
                          case 1: System.out.print("\nDelivery reports\n");
                          break;
                          case 2: System.out.print("\nReply via same centre\n");
                          break;
                          case 3: System.out.print("\nCharacter support\n");
                          break;
                          }
                }
          case 8: System.out.print("\nInfo service\n");
          break;
          case 9: System.out.print("\nVoice mailbox number\n");
          break;
          case 10: System.out.print("\nService command editor\n");
          break;
          }
  break;        
  case 3: System.out.print("\nChat\n");
  break;
  case 4: 
    System.out.println(""" 
                          \n
                          1. Missed calls
                          2. Received calls
                          3. Dialled numbers
                          4. Erase recent call lists
                          5. Show call duration
                          6. Show call costs
                          7. Call cost settings
                          8. Prepaid credit
                          """);
      int callRegister = input.nextInt();
      switch (callRegister) {
      case 1: System.out.print("\nMissed Calls\n");
      break;
      case 2: System.out.print("\nReceived calls\n");
      break;
      case 3: System.out.print("\nDialled numbers\n");
      break;
      case 4: System.out.print("\nErase recent call lists\n");
      break;
      case 5: System.out.println("""
                          \n
                          1. Last call duration
                          2. All calls'
                          3. Received calls' duration
                          4. Dialled calls' duration
                          5. Clear timers
                          """);
      
                int showCallDuration = input.nextInt();
                switch (showCallDuration) {
                
                case 1: System.out.print("\nLast call duration\n");
                break;
                case 2: System.out.print("\nAll calls\n");
                break;
                case 3: System.out.print("\nReceived calls' duration\n");
                break;
                case 4: System.out.print("\nDialled calls' duration\n");
                break;
                case 5: System.out.print("\nClear timer\n");
                break;
                }
        break;
        case 6: System.out.println("""
                          \n
                          1. Last call cost
                          2. All calls’ cost
                          3. Clear counters
                          """);
                          int showCallCosts = input.nextInt();
                          
                          switch (showCallCosts) {
                          
                          case 1: System.out.print("\nLast call cost\n");
                          break;
                          case 2: System.out.print("\nAll calls' cost\n");
                          break;
                          case 3: System.out.print("\nClear counters\n");
                          break;
                          }
        break;
        case 7: 
          System.out.println("""
                                \n
                                1. Call  cost limit
                                2. Show costs in
                                """);
                          int callCostSettings = input.nextInt();
                          switch (callCostSettings) {
                          
                          case 1: System.out.print("\nCall cost limit\n");
                          break;
                          case 2: System.out.print("\nShow costs in\n");
                          break;
                          }
        break;
        case 8: System.out.print("\nPrepaid credit");
        break;
      }
  break;    
  case 5: System.out.println(""" 
                          \n
                          1. Ringing tone
                          2. Ringing volume
                          3. Incoming call alert
                          4. Composer
                          5. Message alert tone
                          6. Keypad tones
                          7. Warning and game tones
                          8. Vibrating alert
                          9. Screen saver
                          """);
                          
                          int tones = input.nextInt();
                          switch (tones) {
                          
                          case 1: System.out.print("\nRinging tone\n");
                          break; 
                          case 2: System.out.print("\nRinging volume\n");
                          break;
                          case 3: System.out.print("\nIncoming call alert\n");
                          break;
                          case 4: System.out.print("\nComposer\n");
                          break;
                          case 5: System.out.print("\nMessage alert tone\n");
                          break;
                          case 6: System.out.print("\nKeypad tones\n");
                          break;
                          case 7: System.out.print("\nWarning and game tones\n");
                          break;
                          case 8: System.out.print("\nVibrating alert\n");
                          break;
                          case 9: System.out.print("\nScreen saver\n");
                          break;
                          }
  break;
  case 6: System.out.println(""" 
                          \n
                          1. Call settings
                          2. Phone settings
                          3. Security settings
                          4. Restore factory settings
                          """);
                          int settings = input.nextInt();
                          switch (settings) {
                          
                          case 1: System.out.println("""
                                                  \n
                                                  1. Automatic redial
                                                  2. Speed dialling
                                                  3. Call waiting options
                                                  4. Own number sending
                                                  5. Phone line in use
                                                  6. Automatic answer
                                                  """);
                                    int callSettings = input.nextInt();
                                    switch (callSettings) {
                                    
                                    case 1: System.out.print("\nAutomatic redial\n");
                                    break;
                                    case 2: System.out.print("\nSpeed dialling\n");
                                    break;
                                    case 3: System.out.print("\nCall waiting options\n");
                                    break;
                                    case 4: System.out.print("\nOwn number sending\n");
                                    break;
                                    case 5: System.out.print("\nPhone line in use\n");
                                    break;
                                    case 6: System.out.print("\nAutomatic answer\n");
                                    break;
                                    }
                          break;          
                          case 2: System.out.println("""
                                                  \n
                                                  1. Language
                                                  2. Cell info display
                                                  3. Welcome note
                                                  4. Network selection
                                                  5. Lights
                                                  6. Confirm SIM service actions
                                                  """);
                          
                                    int phoneSettings = input.nextInt();
                                    switch (phoneSettings) {
                                      
                                    case 1: System.out.print("\nLanguage\n");
                                    break;
                                    case 2: System.out.print("\nCell info display\n");
                                    break;
                                    case 3: System.out.print("\nWelcome note\n");
                                    break;
                                    case 4: System.out.print("\nNetwork selection\n");
                                    break;
                                    case 5: System.out.print("\nLights\n");
                                    break;
                                    case 6: System.out.print("\nConfirm SIM service"
                                    + " actions\n"); 
                                    break;  
                                      }
                           break;
                           case 3: System.out.println("""
                                                  \n
                                                  1. PIN code request
                                                  2. Call barring service
                                                  3. Fixed dialling
                                                  4. Closed user group
                                                  5. Phone security
                                                  6. Change access codes
                                                  """);
                                    int securitySettings = input.nextInt();
                                    switch (securitySettings) {
                                    
                                    case 1: System.out.print("\nPIN code request\n");
                                    break;
                                    case 2: System.out.print("\nCall barring service\n");
                                    break;
                                    case 3: System.out.print("\nFixed dialling\n");
                                    break;
                                    case 4: System.out.print("\nClosed user group\n");
                                    break;
                                    case 5: System.out.print("\nPhone security\n");
                                    break;
                                    case 6: System.out.print("\nChange access codes\n"); 
                                    break;
                                    }
                            break;
                            case 4: System.out.print("\nRestore factory settings\n");
                            break;
                          }
  break;
  case 7:  System.out.print("\nCall divert\n");
  break;
  case 8:  System.out.print("\nGames\n");
  break;
  case 9:  System.out.print("\nCalculator\n");
  break;
  case 10:  System.out.print("\nReminders\n");
  break;
  case 11: System.out.println("""
                              \n
                              1. Alarm clock
                              2. Clock settings
                              3. Date setting
                              4. Stopwatch
                              5. Countdown timer
                              6. Auto update of date and time
                              """);
                              
                              int clock = input.nextInt();
                              switch (clock) {
                              
                              case 1: System.out.print("\nAlarm clock\n");
                              break;
                              case 2: System.out.print("\nClock settings\n");
                              break;
                              case 3: System.out.print("\nDate setting\n");
                              break;
                              case 4: System.out.print("\nStopwatch\n");
                              break;
                              case 5: System.out.print("\nStopwatch\n");
                              break;
                              case 6: System.out.print("\nAuto update of date and"
                              + " time\n"); 
                              break;
                              }
  break;
  case 12: System.out.print("\nProfiles\n");
  break;
  case 13: System.out.print("\nSIM services\n");
  break;
   } 
}
}
