class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
    //   int max=0;
    //     for(int i=0;i<n;i++){
    //         HashSet<Character> set=new HashSet<>();
    //         int count=0;
    //         for(int j=i;j<n;j++){
    //             if(set.contains(s.charAt(j))){
    //                 break;
    //             }
    //             set.add(s.charAt(j));
    //             count++;
    //             max=Math.max(max,count);
    //         }
            
    //     }
    //     return max;
        int max=0;
        int left=0;
        HashSet<Character>  set=new HashSet<>();
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}