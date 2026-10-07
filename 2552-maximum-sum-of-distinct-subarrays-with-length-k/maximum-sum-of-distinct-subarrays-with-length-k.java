class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long maxs=0;
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<k;i++){
        //     set.add(nums[i]);
        //     sum+=nums[i];
        // }
        // if(set.size()==k){
        //     maxs=sum;
        // }
        
        // for(int i=k;i<n;i++){       
        //     set.remove(nums[i-k]);
        //     sum-=nums[i-k];
        //     set.add(nums[i]);
        //     sum+=nums[i];
        //     if(set.size()==k){
        //         maxs=Math.max(maxs,sum);
        //     }
        // }
        // return maxs;


        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        if(map.size()==k){
            maxs=sum;
        }
        
        for(int i=k;i<n;i++){ 
            int old=nums[i-k];
            sum-=old;      
            map.put(old,map.getOrDefault(old,0)-1);
            if(map.get(old)==0){
                map.remove(old);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            if(map.size()==k){
                maxs=Math.max(maxs,sum);
            }
        }
        return maxs;
    }
}