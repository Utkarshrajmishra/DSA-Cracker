class Solution {
    public void duplicateZeros(int[] arr) {
        int N = arr.length;
     
    int cnt=0;
            for(int i=0;i<arr.length;i++)
            {
                    if(arr[i]==0)
                    {
                            cnt++;
                    }
            }
     
 
    int write_idx = N + cnt - 1;
     
   
    int curr = N - 1;
     
    while (curr >= 0 && write_idx >= 0)
    {
            if (write_idx < N)
            arr[write_idx] = arr[curr];
     
        write_idx -= 1;
     
        if (arr[curr] == 0)
        {
            if (write_idx < N)
                arr[write_idx] = 0;
                 
            write_idx -= 1;
        }
        --curr;
    }
     
    }
}
