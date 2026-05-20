class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for ( int i = arr.length-2 ; i>=0; i--) {
            int curr = arr[i];
            arr[i] = Math.max(max, arr[i + 1]);
            max = curr;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}