class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ls = 0, left = 0;
        Set<Character> u = new HashSet<>();
        for ( int i = 0; i < s.length(); i++) {
            while(u.contains(s.charAt(i))) {
                u.remove(s.charAt(left));
                left++;
            }
            u.add(s.charAt(i));
            ls = Math.max(ls, i - left + 1);
        }   
        return ls;
    }
}
