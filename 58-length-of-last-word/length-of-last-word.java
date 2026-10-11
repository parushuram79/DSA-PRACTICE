class Solution {
    public int lengthOfLastWord(String s) {
        // int end = s.length() - 1;

        // while (end >= 0 && s.charAt(end) == ' ') {
        //     end--;
        // }

        // int start = end;
        // while (start >= 0 && s.charAt(start) != ' ') {
        //     start--;
        // }

        // return end - start;        

        //  String[] arr = s.trim().split("\\s+");
        // return arr[arr.length - 1].length();

        s=s.trim();
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)!=' '){
            i--;
        }
        return s.length()-i-1;
    }
}