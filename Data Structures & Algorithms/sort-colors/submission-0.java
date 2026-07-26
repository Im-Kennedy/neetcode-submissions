class Solution {
    public void sortColors(int[] nums) {
        boolean istrue = true;
        while(istrue){
            istrue = false;

            for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                istrue = true;
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                }
            }
        }
        
        
    }
}