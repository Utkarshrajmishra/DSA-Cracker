import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static int foundPattern(String text, String pattern) {
    int N = text.length();
    int M = pattern.length();

    for (int i = 0; i < N; i++) {
      int temp = i;
      int j = 0;
      for (j = 0; j < M; j++) {
        if (text.charAt(temp) != pattern.charAt(j)) {
          break;
        }
        temp++;
      }
      if (j == M) {
        return i;
      }
    }

    return -1;
  }
  public static void main(String[] args) throws java.lang.Exception {
    String text = "takeuforward";
    String pattern = "forward";

    int foundIdx = foundPattern(text, pattern);

    System.out.println("The substring starts from the index: "+foundIdx);
  }
}
