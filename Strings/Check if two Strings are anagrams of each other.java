import java.util.*;
public class Main
{
public static String SortString(String str)
  {
    char c[] = str.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
public static boolean checkAnagrams(String str1, String str2)
  {
   
    if (str1.length() != str2.length())
      return false;
 
    str1 = SortString(str1);
    str2 = SortString(str2);
 
    
    for (int i = 0; i < str1.length(); i++)
    {
      if (str1.charAt(i) != str2.charAt(i))
        return false;
    }
    return true;
  }
public static void main(String args[])
  {
    String Str1 = "INTEGER";
    String Str2 = "TEGERNI";
    System.out.println(checkAnagrams(Str1, Str2));
  }
}
