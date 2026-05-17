class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            bucket.add(i, new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            bucket.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];
        int j = 0;
        for (int i = bucket.size() -1; i >= 0 && j <= k; i--) {
            List<Integer> r = bucket.get(i);
            for (Integer n : r) {
                if ( j == k) {
                    break;
                }
                result[j++] = n;
            }
        }
        return result;
    }
}
