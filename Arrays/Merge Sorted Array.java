class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int arr[]=new int[nums1.length];
            int counter=Math.abs(m);
            int index=0;
            for(int i=0;i<nums1.length;i++)
            {
                   if(i<m)
                   {
                           arr[i]=nums1[i];
                   }
                    else
                    {
                            arr[i]=nums2[index];
                            index++;
                    }
                    
            }
            Arrays.sort(arr);
            for(int i=0;i<nums1.length;i++)
            {
                    nums1[i]=arr[i];
            }
            
            
   }
}
