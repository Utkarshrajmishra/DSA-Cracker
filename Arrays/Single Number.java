class Solution {
    public int singleNumber(int[] nums) {
       
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 1) left = mid + 1;
                else right = mid - 2;
            } else {
                if (mid % 2 == 1) right = mid - 1;
                else left = mid + 2;
            }
        }
        return nums[left];

        
        
    }
}
