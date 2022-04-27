class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
       int start=0,end=arr.length-1;
        for(int i=0;i<=end;)
        {
        if(arr[i] < a)
        {

            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i++;

        }
        else if(arr[i] > b)
        {

            int temp = arr[end];
            arr[end] = arr[i];
            arr[i] = temp;
            end--;

        }

        else
            i++;
    }
        }
    
}

