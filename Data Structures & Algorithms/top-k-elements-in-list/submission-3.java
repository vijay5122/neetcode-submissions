class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> frequency = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entries : counts.entrySet()) {
            frequency.add(new int[] {entries.getValue() , entries.getKey()});
        }

        frequency.sort((a,b) -> b[0] - a[0]);
 
        int[] result = new int[k];
        for (int i = 0 ; i<k ; i++ ) {
            result[i] = frequency.get(i)[1];
        }
        return result;
    }
}
