class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum=0;
        for(int i=0;i<n;i++)
        {
            long currsum=0;
            for(int j=0;j<n;j++)
            {
                currsum+=arr[j];
                if(currsum>sum)
                sum=currsum;
            }
        }
        return sum;
        
    }
    
}

