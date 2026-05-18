class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(new ArrayList<>(Arrays.asList(nums[0], nums[1], nums[2])));
            }
        } else {
            for (int i = 0; i < nums.length - 2; i++) {
                if ( i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[start] + nums[end] + nums[i];
                    if (sum == 0) {
                        result.add(new ArrayList<>(Arrays.asList(nums[start], nums[i], nums[end])));
                        while (start < end && nums[start] == nums[start + 1]) start++;

                        while (start < end && nums[end] == nums[end - 1]) end--;

                        start++;
                        end--;
                        
                    } else if (sum > 0) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
