class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }else{
                map.put(nums[i], 1);
            }
            
        }

        int answer = nums.length/3;
        for(Integer thing : map.keySet()){
            int number = map.get(thing);
            if(number > answer){
                array.add(thing);
            }
        }

        return array;
    }
}