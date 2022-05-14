public class tUf {
  public static String solve(String str, int n) {
    StringBuffer ans = new StringBuffer();
    for (int i = 0; i < n; i++) {
      int ascii = (int) str.charAt(i);

      if (ascii >= 65 && ascii <= 90) // if uppercase
        ans.append(Character.toLowerCase((char) ascii));

      else if (ascii >= 97 && ascii <= 122) // if lowercase
        ans.append(Character.toUpperCase((char) ascii));

      else if (str.charAt(i) == ' ') // if whitespace
        ans.append(' ');
    }

    return ans.toString();
  }
  public static void main(String args[]) {
    String str = "take u forward IS Awesome";
    int length = str.length();

    System.out.println("Resultant string: ");
    System.out.println(solve(str, length));
  }
}
