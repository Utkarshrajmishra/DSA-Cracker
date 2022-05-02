public class Main {
  public static void main(String args[]) {
    int n = 6, r = 4;
    int ans = 1;
    for (int i = n; i >= n - r + 1; i--) {
      ans *= i;
    }
    System.out.print(ans);
  }
}
