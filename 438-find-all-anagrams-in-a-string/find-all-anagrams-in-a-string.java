// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//     List<Integer> li=new ArrayList<>();
//      int k=p.length();
//      for(int i=0;i<=s.length()-k;i++ ){
//         String sub=s.substring(i,i+k);
//         if(isAnagram(p,sub)){
//             li.add(i);
//         }
//      } 
//      return li;
//     }
//     public boolean isAnagram(String s,String s2){
//         char[] c1=s.toCharArray();
//         char[] c2=s2.toCharArray();

//         Arrays.sort(c1);
//         Arrays.sort(c2);

//         return Arrays.equals(c1,c2);
 
//       }  
// }

// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
    //   List<Integer> ans=new ArrayList<>();
    //   if(p.length()>s.length()){
    //     return ans;
    //   }  

    //   HashMap<Character,Integer> need=new HashMap<>();
    //   HashMap<Character,Integer> window=new HashMap<>();

    //   for(char ch:p.toCharArray()){
    //     need.put(ch,need.getOrDefault(ch,0)+1);
    //   }
    //   int k=p.length();
    //   for(int i=0;i<k;i++){
    //     window.put(s.charAt(i),window.getOrDefault(s.charAt(i),0)+1);
    //   }
    //   if(need.equals(window)){
    //     ans.add(0);
    //   }
    //   for(int i=k;i<s.length();i++){
    //     char ch=s.charAt(i);

    //     window.put(ch,window.getOrDefault(ch,0)+1);

    //     char remove=s.charAt(i-k);

    //     window.put(remove,window.get(remove)-1);
    //     if(window.get(remove)==0){
    //         window.remove(remove);
    //     }
    //     if(window.equals(need)){
    //         ans.add(i-k+1);
    //     }
    //   }
    //   return ans;

//     }
// }
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int n1=s.length();
        int n2=p.length();
        if(n2 > n1) return list;

        int[] count1=new int[26];
        int[] count2=new int[26];

        for(int i=0;i<n2;i++){
            count2[p.charAt(i)-'a']++;
            count1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1,count2)) list.add(0);

        for(int i=n2;i<n1;i++){
            count1[s.charAt(i-n2)-'a']--;
            count1[s.charAt(i)-'a']++;

            if(Arrays.equals(count1,count2)) list.add(i-n2+1);
        }
        return list;
    }
}