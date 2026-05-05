class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 0;
        int sum = 0;

        for (left = 0; left < nums.length; left++) {
            right = left + 1;
            while (right < nums.length) {
                sum = nums[left] + nums[right]; 
                if (sum == target) {
                    return new int[]{left, right};
                }
                right++;
            }
        }
        return new int[]{0, 1}; 
    }
}