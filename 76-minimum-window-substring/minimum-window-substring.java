class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0)
            return "";

        int[] need = new int[128];
        int[] window = new int[128];

        int left = 0;
        int formed = 0;
        int required = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Build frequency of t
        for (int i = 0; i < t.length(); i++) {
            if (need[t.charAt(i)] == 0)
                required++;

            need[t.charAt(i)]++;
        }

        // Sliding window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            window[ch]++;

            // Requirement for this character is satisfied
            if (window[ch] == need[ch])
                formed++;

            // Window is valid
            while (formed == required) {

                // Record minimum window
                int len = right - left + 1;

                if (len < minLen) {
                    minLen = len;
                    start = left;
                }

                // Remove left character
                char remove = s.charAt(left);
                window[remove]--;

                // Requirement is no longer satisfied
                if (window[remove] < need[remove])
                    formed--;

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }
}