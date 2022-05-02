import java.util.*;
public class Main {
  public static float SumofGP(float a, float r, int n) {
    float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
    return sum;
  }

  public static void main(String args[]) {
    float a = 2; // First term of G.P.
    float r = 2; // common ratio of G.P.
    int n = 4; // Number of terms of G.P.
    System.out.println("Sum of GP Series is "+SumofGP(a, r, n));
  }
}
