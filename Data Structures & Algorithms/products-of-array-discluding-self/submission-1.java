class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int zeros = 0, product = 1;
        for(int i = 0; i < nums.length; i++ ) {
            if (nums[i] == 0) {
                zeros++;
                continue;
            }
            product = product * nums[i];
        }
        if(zeros >= 2) {
            return result;
        } else {
            for (int i = 0; i < nums.length;i++) {
                if(zeros == 1 && nums[i] != 0) {
                    result[i] = 0;
                } else if (zeros == 1 && nums[i] == 0) { 
                    result[i] = product;
                } else {
                    result[i] = product / nums[i];
                }
            }
        }

        return result;
    }
}  
