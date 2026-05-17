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

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
