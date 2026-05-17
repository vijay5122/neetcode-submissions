class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        for ( int i = 0; i<s2.length(); i++) {
            System.out.println("i : " + i + " s1.indexOf(s2.charAt(i) : " + s1.indexOf(s2.charAt(i)));
            if(s1.indexOf(s2.charAt(i)) != -1) {
                if(i - left + 1 == s1.length()) {
                    if(permutation(s1, s2.substring(left, i + 1))) {
                        return true;
                    } else {
                        left++;
                    }
                    
                }
            } else {
                left = i + 1;
            }
        }
        return false;
    }

    private boolean permutation(String s1, String s2) {

        char[] a = new char[26];
        for (int i=0; i<s1.length() ; i++) {
            a[s1.charAt(i) - 'a']++;
        }
        for (int i=0; i<s2.length() ; i++) {
            a[s2.charAt(i) - 'a']--;
        }

        for ( int i =0; i<a.length;i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
