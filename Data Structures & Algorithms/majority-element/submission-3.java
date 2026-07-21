class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int result = 0;
        
        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if(count > max){
                max = count;
                result = num;
            }
        }
        
        return result;
    }
}