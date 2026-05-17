class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightProd = new int[nums.length];
        int suffix = 1;
        for ( int i = 0; i < nums.length; i++) {
            rightProd[i] = suffix;
            suffix = suffix * nums[i];
        }

        int prefix = 1;
        for ( int i = nums.length - 1; i >=0; i--) {
            int temp = nums[i];
            nums[i] = prefix;
            prefix = prefix * temp;
        }

        for ( int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * rightProd[i];
        }

        return nums;
    }
}  
