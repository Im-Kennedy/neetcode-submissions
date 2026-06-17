class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        while(right < prices.length){
            if(prices[right] > prices[left]){
                if(prices[right] - prices[left] > max){
                    max = prices[right] - prices[left];
                }
            }else {
                left = right;
            }
            right++;
        }
        return max;
    }
}
