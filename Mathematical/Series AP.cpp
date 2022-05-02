class Solution {
  public:
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        return A1+(N-1)*(A2-A1);
    }
};
