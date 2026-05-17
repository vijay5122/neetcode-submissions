class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) {
            return 0;
        }
        int currlcs = 1, maxlcs = 1;
        for(int i = 0; i<nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                continue;
            } else if (nums[i + 1] == (nums[i] + 1)) {
                currlcs++;
                maxlcs = Math.max(maxlcs, currlcs);
            } else {
                currlcs = 1;
            }
        }
        return maxlcs;
    }
}
