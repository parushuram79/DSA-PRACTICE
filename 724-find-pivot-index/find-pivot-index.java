class Solution {
    public int pivotIndex(int[] nums) {
        int pre=0;
        
        for(int i=0;i<nums.length;i++){
          pre+=nums[i];
        }
         int left=0;
        for(int i=0;i<nums.length;i++){
           
            int right=0;
        left+=nums[i];
        right=pre-left+nums[i];
        if(left==right){
            return i;
        }
        }
    return -1;
    }
}