class Solution {
    public int longestOnes(int[] nums, int k) {
      int max=0;
      int zeroc=0;
      int left=0;
      for(int right=0;right<nums.length;right++){
        if(nums[right]==0){
            zeroc++;
        }
        while(zeroc>k){
            if(nums[left]==0){
                zeroc--;
            }
            left++;
        }
        max=Math.max(max,right-left+1);
      }
      return max;
    }
}