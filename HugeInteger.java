import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.math.BigInteger;

public class HugeInteger {
  private int sum = 0;
  private int product = 0;
  private double division = 0;
  private int remainder = 0;
  private List<Integer>  integerArrayList = new ArrayList<>(40);
  
  Scanner input = new Scanner(System.in);
      
  public void parse(String integer) {
    for (int index = 0; index < integer.length() ; index++) {
      integerArrayList.add(integer.charAt(index) - '0');
    }  
  }
  
  public void toString(List<BigInteger> objects) {
    for(BigInteger object : objects) 
    System.out.print("" + object + "") ;
    System.out.println();
  }
  
  
  public List getIntegerArrayList() {
    return integerArrayList;  
  }

  public BigInteger add(List<BigInteger> objects) {
     BigInteger sums = new BigInteger("0");
    for (BigInteger object : objects) {
    sums = sums.add(object);
    }
    return sums;
    }
 
  
 public BigInteger subtract(List<BigInteger> objects) {
  BigInteger integer1 = objects.get(0);
  BigInteger integer2 = objects.get(1);
  return integer1.subtract(integer2) ;
  }
  //}
/*  public BigInteger multiply(List<Integer>... objects) {
  
    return ;
  }
  
  public BigInteger divide(List<Integer>... objects) {
  
    return;
  }
  
  public BigInteger remainder(List<Integer>... objects) {
  
    return ;
  }

  public boolean isEqualTo(List<Integer> objectOne, List<Integer> objectTwo) {
  
    return true;
  }
  
  public boolean isGreaterThan(List<Integer> objectOne, List<Integer> objectTwo) {
    return true;
  }
  
  public boolean isLessThan(List<Integer> objectOne, List<Integer> objectTwo) {
    return true;
  }
  
  public boolean isGreaterThanOrEqualTo(List<Integer> objectOne, List<Integer> objectTwo) {
    return true;
  }
  
  public boolean isLessThanOrEqualTo(List<Integer> objectOne, List<Integer> objectTwo) {
    return true;
  }
  
  public boolean isZero(List<Integer> object) {
    return true;
  }
  */
}
 
