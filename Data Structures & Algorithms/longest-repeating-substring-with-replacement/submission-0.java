class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount = 0, maxFreq = 0, left = 0, count = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i<s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(i)));

            while(i - left + 1 - maxFreq > k) {
                freq.put(s.charAt(left) , freq.get(s.charAt(left)) - 1);
                left++;
            }

            maxCount = Math.max(maxCount, i - left + 1);
        }
        return maxCount;
    }
}
