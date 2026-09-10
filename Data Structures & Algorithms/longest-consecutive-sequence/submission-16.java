//1.
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Map<Integer, Integer> mp = new HashMap<>();
//         int res = 0;

//         for (int num : nums) {
//             if (!mp.containsKey(num)) {
//                 mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
//                 mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
//                 mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
//                 res = Math.max(res, mp.get(num));
//             }
//         }
//         return res;
//     }
// }

//2.
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        int curr  = nums[0];
        int res  = 1;
        int streak = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                streak = 1;
            }

            if (nums[i] == curr) {
                continue;
            }
            if (nums[i] == (curr + 1)) {
                streak++;
            } else {
                streak = 1;
            }
            curr = nums[i];
            res = Math.max(res, streak);

        }

        return res;

    }
}