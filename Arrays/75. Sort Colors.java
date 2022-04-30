class Solution {
    public void sortColors(int[] nums) {
           int zeroes = 0;
        int ones = 0;
        int twos = 0;
        
        for (int num : nums) {
            if (num == 0) zeroes++;
            else if (num == 1) ones++;
            else twos++;
        }
        
        int i = 0;
        while (zeroes-- > 0)
            nums[i++] = 0;
        while (ones-- > 0)
            nums[i++] = 1;
        while (twos-- > 0)
            nums[i++] = 2;
    }
}
