class Solution {
    public int maxProfit(int[] prices) {
        
        int l = 0;
        int r = 1;
        int res = 0;

        while (r < prices.length) {
            int tmp = 0;
            if (prices[l] < prices[r]) {
                tmp = prices[r] - prices[l];
                res = Math.max(tmp, res);
            } else {
                l = r;
            }
            r++;
        }
        return res;
    }
}
