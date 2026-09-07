class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(h.entrySet());

        // Sort by frequency
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Store answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;

    }
}
