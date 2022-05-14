import java.util.*;

public class Solution {

    static void nonRepeating(String st, int n) {
        int freq[] = new int[200];
        char s[] = st.toCharArray();

        for (int i = 0; i < n; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s[i] == s[j]) {
                    freq[i]++;

                    s[j] = '-'; // set s[j] to 0 to avoid printing visited character
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            if (freq[i] == 1 && s[i] != ' ' && s[i] != '-') {
                System.out.print(s[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String st = "blockchain technology";

        int n = st.length();
        System.out.println("Non-repeative character: ");
        nonRepeating(st, n);

    }
}
