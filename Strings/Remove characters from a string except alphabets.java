public class tUf {
  public static String solve(String str, int n) {
    StringBuffer ans = new StringBuffer();

    for (int i = 0; i < n; i++) {
      int ascii = (int) str.charAt(i); //ascii value

      if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
        ans.append(str.charAt(i));
    }

    return ans.toString();
  }
  public static void main(String args[]) {
    String str = "take12% *&u ^$#forward";
    int n = str.length();

    System.out.println("Resultant string:");
    System.out.println(solve(str, n));
  }
}
