class Solution {
    public int maxSubArray(int[] nums) {

        int max=Integer.MIN_VALUE;
        int curs=0;
        for(int x:nums){
            curs+=x;
            max=Math.max(curs,max);
            if(curs<0){
                curs=0;
            }
        }
        return max;
    }
}
