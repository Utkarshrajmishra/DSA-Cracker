class Solution {
    static int countSquares(int N) {
        // code here
        int count=0;
        int i=1;
        while(i*i<N)
        {
            count++;
            i++;
        }
        return count;
    }
}
