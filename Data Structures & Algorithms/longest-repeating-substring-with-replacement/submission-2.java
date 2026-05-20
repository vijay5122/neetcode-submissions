class Solution {
    public int characterReplacement(String s, int k) {
        int lc = 0, left = 0, maxFreq = 0;
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i),0) + 1);
            maxFreq = Math.max(maxFreq, m.get(s.charAt(i)));

            while (i - left + 1 - maxFreq > k) {
                m.put(s.charAt(left), m.get(s.charAt(left)) - 1);
                left++;
            }

            lc = Math.max(lc, i - left + 1);
        }
        return lc;
    }
}
