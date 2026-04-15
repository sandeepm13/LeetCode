class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int target = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[target]) {
                swap(nums, i, target);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public void swap(int[] nums, int i, int target) {
        int temp = nums[target];
        nums[target] = nums[i];
        nums[i] = temp;
    }
}