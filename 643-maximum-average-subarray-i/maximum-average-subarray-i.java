class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        int windowsum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        max=windowsum;
        for(int i=k;i<n;i++){
            windowsum+=nums[i];
            windowsum-=nums[i-k];
            max=Math.max(max,windowsum);
        }
        return (double)max/k;
        // int max=0;
        // for(int i=0;i<=nums.length-k;i++){
        //     int windowsum=0;
        //     for(int j=i;j<i+k;j++){
        //         windowsum+=nums[j];
        //     }
        // max=Math.max(max,windowsum);
        // }
        // return (double) max/k;
    }
}