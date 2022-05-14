class Solution {
    public boolean isPalindrome(String s) {
         int i = 0, j = s.length() - 1;
        char[] chs = s.toLowerCase().toCharArray();
        while (i < j) {
            while (i < j && !s.isAlphanumeric(chs[i])) ++i;
            while (i < j && !s.isAlphanumeric(chs[j])) --j;
            
            if (chs[i] != chs[j]) return false;
            ++i;
            --j;
        }
        return true;
    }
}
