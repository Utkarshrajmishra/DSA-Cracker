import java.util.*;
 
class Main {
  public static String removeDuplicateLetters(String s) {
 
    String ans = "";
    boolean[] map = new boolean[26];
    for (int i = 0; i < s.length(); i++) {
      if (map[s.charAt(i) - 'a'] == false) {
        ans += s.charAt(i);
        map[s.charAt(i) - 'a'] = true;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    String str = "cbacdcbc";
    System.out.println("Original String: "+str+"\nAfter removing duplicates: 
    "+removeDuplicateLetters(str));
 
  }
}
