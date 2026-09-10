//1.
// class Solution {
//     public int trap(int[] height) {
//         int l = 0;
//         int r = height.length - 1;
//         int water = 0;
//         int leftMax = height[l];
//         int rightMax = height[r];
//         while (l < r) {

//             if (leftMax < rightMax) {
//                 l++;
//                 leftMax = Math.max(leftMax, height[l]);
//                 water += leftMax - height[l];
//             } else {
//                 r--;
//                 rightMax = Math.max(rightMax, height[r]);
//                 water += rightMax - height[r];
//             }
//         }
//         return water;
//     }
// }
//2.
class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack =new Stack<>();
        int res = 0;
        
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int mid = height[stack.pop()];
                if (!stack.isEmpty()) {
                    int left = height[stack.peek()];
                    int right = height[i];
                    int width = i - stack.peek() - 1;
                    int h  = Math.min(left, right) - mid;
                    int water = h * width;
                    res += water; 
                }
            }
            stack.push(i);
        }
        return res;
    }
}
