class Solution {
    //1.
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return new int[0];
    }
//2.
    // public int[] twoSum(int[] numbers, int target) {
    //     Map<Integer, Integer> mp = new HashMap<>();
    //     for (int i = 0; i < numbers.length; i++) {
    //         int tmp = target - numbers[i];
    //         if (mp.containsKey(tmp)) {
    //             return new int[] { mp.get(tmp), i + 1 };
    //         }
    //         mp.put(numbers[i], i + 1);
    //     }
    //     return new int[0];
    // }


}
