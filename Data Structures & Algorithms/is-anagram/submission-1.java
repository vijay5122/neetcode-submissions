class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if(charCount.containsKey(s.charAt(i))) {
                int existingCount = charCount.get(s.charAt(i));
                charCount.put(s.charAt(i), existingCount + 1);
            }
            else {
                charCount.put(s.charAt(i), 1);
            }
        }

        for(int j=0; j<t.length(); j++) {
            if (!charCount.containsKey(t.charAt(j))) {
                return false;
            } else {
                charCount.put(t.charAt(j), charCount.get(t.charAt(j)) - 1);
            }
        }

        for(var entry : charCount.entrySet()) {
            if(entry.getValue() != null && entry.getValue() != 0 ) {
                return false;
            }
        }
        return true;
    }
}
