class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if((nums[i] + nums[j]) == target){
    //                 int[] newarray = new int[2];
    //                 newarray[0] = i;
    //                 newarray[1] = j;
    //                 return newarray;
    //             }
    //         }
    //     }
    //     return null;
    // }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();//store values to keep track

        for(int i = 0; i < nums.length; i++){//loop through array
            int currentNumber = nums[i];//current i value
            int neededNumber = target - currentNumber;//subtract target from i

            if(map.containsKey(neededNumber)){
                int[] answer = new int[2];

                answer[0] = map.get(neededNumber);
                answer[1] = i;
                return answer;
            }

            map.put(nums[i], i);
        }
        return new int[]{};

    }
}
