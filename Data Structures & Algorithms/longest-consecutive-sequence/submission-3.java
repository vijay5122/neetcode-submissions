class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i =0; i<nums.length; i++) {
            numSet.add(nums[i]);
        }
        int lcs = 1, maxlcs = 0;
        int index = 1;
        for(int i=0; i< nums.length; i++) {

            while(numSet.contains(nums[i] + index)) {
                lcs++;
                index++;
            }
            maxlcs = Math.max(lcs, maxlcs);
            lcs = 1;
            index = 1;
        }
        return maxlcs;
    }
}
