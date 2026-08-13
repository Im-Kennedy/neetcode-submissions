class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength = Integer.MAX_VALUE;
        int left = 0;
        int currentsum = 0;

        for(int i = 0; i < nums.length; i++){
            currentsum = currentsum + nums[i];

            while(currentsum >= target){
                minlength = Math.min(minlength, i - left + 1);
                currentsum = currentsum - nums[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
        
    }
}