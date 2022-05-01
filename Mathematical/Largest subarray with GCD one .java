class Solution
{
    static int findLargestSubarray(int arr[], int n)
    {
        // code here
          int k=arr[0];
    for(int i=1;i<n;i++)
    {
         k=gcd(k,arr[i]);
         
        
    }
     return (k==1)?n:-1;
    }
    static int gcd(int a, int b)
    {
       if(a==0)
       {
           return b;
       }
       return gcd(b%a, a);
    }
}
