class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, ls = 0;
        Set<Character> charSet = new HashSet<>();
        for( int i =0; i<s.length(); i++) {
            while (charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(i));
            ls = Math.max(ls, i - left + 1);
        }
        return ls;
    }
}
