class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> ll=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(ll.contains(nums[i]))
            {
                return nums[i];
            }
            ll.add(nums[i]);
        }
        return -1;
    }
}
