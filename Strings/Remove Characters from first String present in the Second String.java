import java.util.*;
public class tUf {
  public static String solve(String str1, String str2) {
    HashMap < Character, Integer > mp = new HashMap < > ();
    StringBuffer ans = new StringBuffer();
    for (int i = 0; i < str2.length(); i++) {
      mp.put(str2.charAt(i), 1);
    }
    for (int i = 0; i < str1.length(); i++) {
      if (mp.get(str1.charAt(i)) == null)
        ans.append(str1.charAt(i));
    }
    return ans.toString();
  }

  public static void main(String args[]) {
    String str1 = "abcdef";
    String str2 = "cefz"; 

    System.out.println("Final string 1:");
    System.out.println(solve(str1, str2));
  }
}
