class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newarray = new int[nums.length];
        int index = 0;
        for(int i = 0; i < nums.length; i++){

            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    product = product *nums[j];
                }

            }
            newarray[i] = product;
        }
        return newarray;
    }
}  
