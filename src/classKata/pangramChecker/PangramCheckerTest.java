package classKata.pangramChecker;

import org.junit.Test;

import static org.junit.Assert.*;

public class PangramCheckerTest {

 @Test
 public void checkPangramTest(){
  PangramChecker pangramChecker = new PangramChecker();
  
  String input = "The quick brown fox jumps over the lazy dog";
  boolean expected = pangramChecker.isPangram(input);
     assertTrue(expected);
  
  String invalidInput = "The quick brown fox";
  boolean result = pangramChecker.isPangram(invalidInput);
     assertFalse(result);
 }
}
  
