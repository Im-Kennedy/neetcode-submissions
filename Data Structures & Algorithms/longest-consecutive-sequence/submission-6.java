class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int number = 1;

        int max = 0;
        if(nums.length == 0){
            number = 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }else{
                set.add(nums[i]);
            }
        }

        for(Integer thing : set){
            int current = 0;
            number = 1;
            if(!set.contains(thing - 1)){
                current = thing;
                while(set.contains(current + 1)){
                    number++;
                    current++;
                }
                if(number > max){
                    max = number;
                }
            }
        }
        return max;
    }
}
