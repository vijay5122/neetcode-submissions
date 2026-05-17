class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for ( int i = 0; i < arr.length; i++) {
            int max = 0;
            for ( int j = i + 1; j < arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            result[index] = max;
            index++;
        }
        result[arr.length - 1] = -1;
        return result;
    }
}