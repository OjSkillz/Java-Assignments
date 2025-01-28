package classKata.pangramChecker;

public class PangramChecker{

  public static boolean isPangram(String string) {
   boolean result = true;
   final int length_of_alphabets = 26;
  if (string.length() < length_of_alphabets) result = false;
      for (char alphabet = 'a'; alphabet <= 'z'; alphabet++){
          if (string.indexOf(alphabet) == -1 ) result = false;
    
        }
        return result;
}
}
