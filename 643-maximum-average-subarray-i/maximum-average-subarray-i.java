class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];       
            windowSum -= nums[i - k];   
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;

        
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