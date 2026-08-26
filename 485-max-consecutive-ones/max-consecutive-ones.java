class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 ;
        int s = 0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
            count++;
           }
           s = Math.max(count,s);
           if(nums[i]==0){ count = 0; }
        }
        return s;
    }
}