class Solution {
    public int maxSubArray(int[] nums) {
        long max = nums[0];
        long sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }

        return (int) max;
    }
}