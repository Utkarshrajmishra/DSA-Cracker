class Solution{
public:
    int isPossible(int N, int arr[]){
        // code here
         int rem = 0;
        for(int i = 0; i < N; i++)
            rem = (rem + arr[i])%3;
        return (rem == 0);
    }
};
