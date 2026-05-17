class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0 , end = numbers.length - 1;
        int[] result = new int[2];
        while(start < end) {
            if((numbers[end] + numbers[start]) == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (numbers[end] + numbers[start] > target) {
                end --;
            } else {
                start++;
            }
        }
        return result;
    }
}
