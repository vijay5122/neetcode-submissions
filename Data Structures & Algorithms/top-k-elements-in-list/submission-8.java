class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        List<List<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            bucket.add(i, new ArrayList<>());
        }

        for (Integer key : freq.keySet()) {
            int count = freq.get(key);
            List<Integer> l = bucket.get(count);
            l.add(key);
            bucket.set(count, l);
        }

        int[] result = new int[k];
        int j = 0;
        for (int i = bucket.size() -1; i >= 0; i--) {
            List<Integer> r = bucket.get(i);
            for (Integer n : r) {
                if ( j == k) {
                    break;
                }
                result[j] = n;
                j++;
            }
        }
        return result;
    }
}
