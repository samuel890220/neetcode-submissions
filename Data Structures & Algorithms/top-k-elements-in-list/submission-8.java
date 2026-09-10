class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//1.
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
//2.
        // Map<Integer, Integer> count = new HashMap<>();
        // for (int num : nums) {
        //     count.put(num, count.getOrDefault(num, 0) + 1);
        // }

        // PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
        //     heap.offer(new int[]{entry.getValue(), entry.getKey()});
        //     if (heap.size() > k) {
        //         heap.poll();
        //     }
        // }

        // int[] res = new int[k];
        // for (int i = 0; i < k; i++) {
        //     res[i] = heap.poll()[1];
        // }
        // return res;
    }
}
