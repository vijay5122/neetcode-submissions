class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> u = new HashSet<>();
        for ( int i = 0; i < nums.length; i++) {
            u.add(nums[i]);
        }

        int currLcs = 1, maxLcs = 0;
        int index = 1;
        for ( int i = 0; i < nums.length; i++) {
            if ( u.contains(nums[i] - 1)) {
                continue;
            }
            while(u.contains(nums[i] + index)) {
                currLcs++;
                index++;
            }
            maxLcs = Math.max(currLcs, maxLcs);
            index = 1;
            currLcs = 1;
        }
        return maxLcs;
    }
}
