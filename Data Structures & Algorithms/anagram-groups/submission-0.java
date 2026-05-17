class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listAnagrams = new ArrayList<>();
        for (int i = 0 ; i < strs.length; i++) {
            boolean isAnagram = false;
            int index = 0;
            for (int j = 0; j < listAnagrams.size() ; j++) {
                if (isAnagram(strs[i], listAnagrams.get(j).get(0))) {
                    isAnagram = true;
                    index = j;
                    break;
                }
            }
            if (isAnagram) {
                List<String> l = listAnagrams.get(index);
                l.add(strs[i]);
                listAnagrams.set(index, l);
            } else {
                listAnagrams.add(new ArrayList<>(Arrays.asList(strs[i])));
            }
            
        }
        return listAnagrams;
    }

    private boolean isAnagram(String str1, String str2) {
        int[] charNums = new int[26];
        for (int i = 0; i<str1.length(); i++) {
            charNums[str1.charAt(i) - 'a']++;
        }
        for (int j = 0; j<str2.length(); j++) {
            charNums[str2.charAt(j) - 'a']--;
        }
        
        for (int i = 0; i<charNums.length; i++) {
            if(charNums[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
