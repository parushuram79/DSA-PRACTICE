// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(needle.length()>haystack.length()) return -1;
//         int[] freq=new int[26];
//         int[] freq2=new int[26];
//         for(int i=0;i<needle.length();i++){
//             freq[needle.charAt(i)-'a']++;
//             freq2[haystack.charAt(i)-'a']++;
//         }
//         if (Arrays.equals(freq,freq2)) return 0;

//         for(int i=needle.length();i<haystack.length();i++){
//             freq2[haystack.charAt(i-needle.length())-'a']--;
//             freq2[haystack.charAt(i)-'a']++;
//             if(Arrays.equals(freq,freq2)) return (i-needle.length()+1);
//         }
//         return -1;
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m==0) return 0;
        if(m>n) return -1;
        
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==m){
                return i;
            }
            
        }
        return -1;
    }
}