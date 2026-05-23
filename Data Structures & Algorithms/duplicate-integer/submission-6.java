class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index = 0;
        while(index < nums.length){
            if(map.containsKey(nums[index])){
                return true;
            }
            map.put(nums[index], index);
            index++;
        }
        // boolean check = false;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         System.out.println("nums: " + nums[i] + " " + nums[j]);
        //         if(nums[i] == nums[j]){
        //             check = true;
        //         }
        //     }
        // }
        return false;
    }
}