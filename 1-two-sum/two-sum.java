class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  int n=nums.length;
    //  //int [] arr=new int[2];
    //  for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //     if(nums[i]+nums[j]==target){
    //         return new int[]{i,j};
    //     }
    //  }
    //  }
     
     
     HashMap<Integer,Integer> hm=new HashMap<>();

     for(int i=0;i<nums.length;i++){
        int need=target-nums[i];
        if(hm.containsKey(need)){
            return new int[]{hm.get(need),i};
        }
        hm.put(nums[i],i);
        
     }
      return new int[]{};
        // int left=0;
        // int right=nums.length-1;
        // while(left<right){
        //     int curs=nums[left]+nums[right];
        //     if(curs==target){
        //         return new int[]{left,right};
        //     }else if(curs<target){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return new int[]{-1,-1};
    }
}