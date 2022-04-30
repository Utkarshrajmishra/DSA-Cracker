class Solution {
    public boolean validMountainArray(int[] arr) {
      if(arr.length<3)
      {
          return false;
      }
        boolean flag=true;
        int index=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                index=i;
                if(i<1)
                {
                    return false;
                }
                break;
            }
            else if(arr[i]==arr[i+1])
            {
                return false;
            }
        }
        for(int i=index;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                return false;
            }
            else if(arr[i]==arr[i+1])
            {
                return false;
            }
        }
        return flag;
    }
}
