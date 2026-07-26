class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return ;
        }

        int start = 0;
        int last = nums.length - 1;
        int current = 0;

        while(current <= last && start < last){
            if(nums[current] == 0){
                nums[current] = nums[start];
                nums[start] = 0;
                start++;
                current++;
            }else if(nums[current] == 2){
                nums[current] = nums[last];
                nums[last] = 2;
                last--;
            }else{
                current++;
            }
        }
        
        
    }
}