import java.util.*;

public class Solution {

       static int findSum(String str) {
              String tempSum = "0";
              int sum = 0;
              for (int i = 0; i < str.length(); i++) {
                     char s = str.charAt(i);

                     if (Character.isDigit(s))
                            tempSum += s;

                     else {
                            sum += Integer.parseInt(tempSum);
                            tempSum = "0";
                     }
              }

              return sum + Integer.parseInt(tempSum);
       }

       public static void main(String[] args) {

              String str = "1bc268";
              System.out.print("Sum: ");
              System.out.println(findSum(str));
       }
}

