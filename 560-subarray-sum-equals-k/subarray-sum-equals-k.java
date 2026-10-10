// class Solution {
//     public int subarraySum(int[] nums, int k) {
//     //    int n=nums.length;
//     //    int count=0;
//     //    for(int i=0;i<n;i++){
//     //     int sum=0;
//     //     for(int j=i;j<n;j++){
//     //         sum=sum+nums[j];
//     //         if(sum==k){
//     //             count++;
//     //         }
//     //     }
//     //    }
//     //    return count;

//     int n=nums.length;
//     int count=0;
//     int prefixs[]=new int[n];
//     prefixs[0]=nums[0];
//     for(int i=1;i<n;i++){
//         prefixs[i]=prefixs[i-1]+nums[i];
//     }
//     HashMap<Integer,Integer> hm=new HashMap<>();
//     for(int i=0;i<n;i++){
//         if(prefixs[i]==k){
//             count++;
//         }
   
//         int val=prefixs[i]-k;
//         if(hm.containsKey(val)){
//             count+=hm.get(val);
//         }
//         hm.put(prefixs[i],hm.getOrDefault(prefixs[i],0)+1);
//     }
//     return count;

//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int x : nums) {
            sum += x;

            //int val = sum - k;
            count += hm.getOrDefault(sum - k, 0);

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}