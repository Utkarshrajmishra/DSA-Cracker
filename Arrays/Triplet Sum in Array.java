
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int X) { 
    
       // Your code Here
       for(int i=0;i<n-2;i++)
       {
           int current=X-arr[i];
           HashSet<Integer> set=new HashSet<>();
             for(int j=i+1;j<n;j++)
             {
                 if(set.contains(current-arr[j]))
                 {
                     return true;
                 }
                 
                 set.add(arr[j]);
             }
       }
       return false;
    
    }
}
