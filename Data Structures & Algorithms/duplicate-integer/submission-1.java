class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        int numsLen = nums.length;
        for(int i=0;i < numsLen;i++) {
            store.add(nums[i]);
        }
        if(store.size() < numsLen) {
           return true;
        } else {
           return false;
        }
    
    }
}