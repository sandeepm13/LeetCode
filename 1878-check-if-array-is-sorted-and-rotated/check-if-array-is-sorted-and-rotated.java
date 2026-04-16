class Solution {
    public boolean check(int[] nums) {
      int len = nums.length;
      int count = 1;

      if(nums.length == 1){
        return true;
      }

      for(int i = 1;i<len*2;i++){
        if(nums[(i-1)%len] <= nums[i%len]){
            count++;
            if (count == len){
                // count = len;
                break;
            }
        }else{
            if(count == len){
                break;
            }else{
                count = 1;
            }
         
        }
      }
      if(count == len){
        return true;
      }
      return false;
    }
}