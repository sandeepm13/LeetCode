class Solution {
    public int findPeakElement(int[] nums) {
                int start = 0;
        int end = nums.length-1;

        while(start < end){

            int mid = start + (end-start)/2;

            if(nums[mid] > nums[mid+1]){
                end = mid; //we elemeinate the RHS part of array as it is in descending order
            }else{
                start = mid+1; //we elemeinate the LHS part of array as it is in ascending order
            }
        }
        return start;
    }
}