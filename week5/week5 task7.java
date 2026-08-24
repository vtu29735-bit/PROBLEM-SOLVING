class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        int left = 0;
        int maxLength = 0;

        // Initialize all positions to -1
        java.util.Arrays.fill(lastSeen, -1);

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character was already seen inside the current window
            if (lastSeen[c] >= left) {
                left = lastSeen[c] + 1;
            }

            lastSeen[c] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

output

Input
s =
"abcabcbb"
Output
3
Expected
3
