// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         // int n1 = s1.length();
//         // int n2 = s2.length();

//         // if(n2 < n1) return false;

//         // int[] count1 = new int[26];
//         // int[] count2 = new int[26];

//         // for(int i = 0; i < n1; i++){
//         //     count1[s1.charAt(i) - 'a']++;
//         //     count2[s2.charAt(i) - 'a']++;
//         // }

//         // if(Arrays.equals(count1, count2)) return true;

//         // for(int i = n1; i < n2; i++){
//         //     count2[s2.charAt(i) - 'a']++;                 
//         //     count2[s2.charAt(i - n1) - 'a']--;          

//         //     if(Arrays.equals(count1, count2)) return true;
//         // }

//         // return false;
        

//     }
// }

class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        for(int i=0;i<=s2.length()-k;i++){
            String sub=s2.substring(i,i+k);
            if(isAnagram(s1,sub)){
                return true;
            }
        }
        return false;

    }
       public boolean isAnagram(String s,String s2)
       {
        char[] c1=s.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);


        }
}