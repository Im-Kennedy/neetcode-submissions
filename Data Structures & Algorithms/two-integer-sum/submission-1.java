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

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int currentNumber = nums[i];

            int neededNumber = target - currentNumber;

            if(map.containsKey(neededNumber)) {

                int[] answer = new int[2];

                answer[0] = map.get(neededNumber);

                answer[1] = i;

                return answer;

            }

            map.put(currentNumber, i);

        }

        return null;

    }
}
