class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        long counter=0;
        for(int i = 2; i< N; i++) {
         while(N%i == 0) {
            if(counter<N)
            counter=i;
            N = N/i;
         }
      }
      if(N >2) {
         if(counter<N)
         counter=N;
      }
      return counter;
    }
}
