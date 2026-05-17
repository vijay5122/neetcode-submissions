class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        for (int i=0; i < s.length();i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for(int j=0;j < t.length();j++) {
            chars[t.charAt(j) - 'a']--;
        }
        for (int i=0; i<chars.length;i++) {
            if (chars[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
