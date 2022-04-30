class Solution {
    public int findNumbers(int[] nums) {
        int number=0;
            int counter=0;
            for(int i=0;i<nums.length;i++)
            {
                    while(nums[i]>0)
                    {
                            counter++;
                            nums[i]/=10;
                    }
                    if(counter%2==0)
                    {
                            number++;
                    }
                    counter=0;
            }
            return number;
    }
}
