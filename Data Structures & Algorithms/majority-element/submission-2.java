class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            if(map.containsKey(nums[i])){
                count = map.get(nums[i]);
                map.put(nums[i], ++count);
                if(count > max){
                    max = count;
                    result = nums[i];
                }
            }else{
                map.put(nums[i], 1);
                if(1 > max){
                    max = 1;
                    result = nums[i];
                }
            }
        }
        
        return result;
    }
}