class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPart = firstPart(nums, target);
        int secondPart = secondPart(nums, target);

        if (firstPart != -1 && secondPart != -1) {
            return new int[]{firstPart, secondPart};
        } else {
            return new int[]{-1, -1};
        }
    }

    public int firstPart(int nums[], int target) {
        int start = 0, end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                first = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }

    public int secondPart(int nums[], int target) {
        int start = 0, end = nums.length - 1;
        int second = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                second = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return second;
    }
}