public class Main {
  public static void main(String args[]) {
    int l = 2, r = 7;
    //sum(1 to r) - sum(1 to l-1)
    int ans = (r * (r + 1)) / 2 - ((l - 1) * (l)) / 2;
    System.out.print("The sum of the numbers in the given range is "+ans);
  }
}
