class Solution {
    //1.
    // public int[] twoSum(int[] numbers, int target) {
    //     int left = 0;
    //     int right = numbers.length - 1;
    //     int[] result = new int[2];
    //     while (left < right) {
    //         int sum = numbers[left] + numbers[right];
    //         if (sum == target) {
    //             return new int[]{left + 1, right + 1};
    //         } else if(target > sum) {
    //             left++;
    //         } else if(target < sum) {

    //             right--;
    //         } 
            
    //     }
    //     return new int[0];
    // }
    //2.
        public int[] twoSum(int[] numbers, int target) {
            Map<Integer, Integer> mp = new HashMap<>();
            for(int i = 0; i < numbers.length; i++) {
                int tmp = target - numbers[i];
                if(mp.containsKey(tmp)) {
                    return new int[] { mp.get(tmp), i + 1};
                } else {
                    mp.put(numbers[i], i + 1);
                }
            }
            return new int[0];
            
        }


}
