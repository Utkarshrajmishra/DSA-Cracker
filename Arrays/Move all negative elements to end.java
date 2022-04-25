class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int counter=0;
        // Your code goes here
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                counter++;
            }
            
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
               temp[j]=arr[i]; j++;
            }
            else
            {
                temp[counter]=arr[i];
                counter++;
            }
          
        }
        
          for(int i=0;i<n;i++)    { 
              arr[i]=temp[i]; 
              }
   }
    
}
