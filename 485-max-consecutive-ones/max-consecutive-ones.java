class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> Count = new ArrayList<>();
            int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                count++;
            }else{
                count = 0;
              
            }
                Count.add(count);
        }
        int max=-1;
        for(int i = 0;i<Count.size();i++){
            if(Count.get(i)>max){
                max = Count.get(i);
            }
        }
    return max;
    }
}