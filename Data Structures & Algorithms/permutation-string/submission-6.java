class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int left = 0, count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (freq[s2.charAt(i) - 'a']-- > 0) {
                count++;
            }

            if (count == s1.length()) {
                return true;
            }

            if (i - left + 1 == s1.length()) {
                if (freq[s2.charAt(left) - 'a']++ >= 0) {
                    count--;
                }
                left++;
            }
        }
        return false;
    }
}
