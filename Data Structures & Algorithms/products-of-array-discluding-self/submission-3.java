class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] returnarray = new int[nums.length];

        int leftproduct = 1;
        for(int i = 0; i < nums.length; i++){
            returnarray[i] = leftproduct;
            leftproduct = leftproduct * nums[i];
        }

        int rightproduct = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            returnarray[i] = rightproduct * returnarray[i];
            rightproduct = rightproduct * nums[i];

        }

        return returnarray;
    }
}  
