class Solution{
  public:
    int middle(int A, int B, int C){
        //code here//Position this line where user code will be pasted.
         if (A < B)
        return (B < C)? B : max(A, C);
      return (A < C)? A : max(B, C);
       
    }
};
