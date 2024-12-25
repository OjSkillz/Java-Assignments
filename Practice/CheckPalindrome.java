public class CheckPalindrome{
  public static void main(String...args) {
  
  System.out.println(isPalindrome(343));
  }
  public static int reverse(int number) {
    String reversed = "";
    for( int index = String.valueOf(number).length() - 1; index >= 0; index--) {
      reversed+= String.valueOf(number).charAt(index);
    }
    return Integer.parseInt(reversed);
    }
    public static boolean isPalindrome(int number) {
      return number == reverse(number);
    }
  }
