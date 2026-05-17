class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] frequency = new List[nums.length + 1];
        for(int i =0; i<nums.length + 1; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entries : counts.entrySet()) {
            List<Integer> el = frequency[entries.getValue()];
            el.add(entries.getKey());
            frequency[entries.getValue()] = el;
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = frequency.length -1 ; i>0 && index < k ; i-- ) {
            for (int num : frequency[i]) {
                result[index] = num;
                if (index == k) {
                    return result;
                }
                index++;
            }
        }
        return result;
    }
}
