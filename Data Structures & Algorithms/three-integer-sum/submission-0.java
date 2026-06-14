class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> biglist = new ArrayList<>();

        
        for(int i = 0; i < nums.length - 2; i++){
            
            if(i == 0 || i > 0 && nums[i] != nums[i-1]){
                int front = i + 1;
                int back = nums.length - 1;
                int target = 0 - nums[i];
                
                while(front < back){
                    int currentsum = nums[front] + nums[back];
                    if(target == currentsum){
                        biglist.add(Arrays.asList(nums[i], nums[front], nums[back]));
                        while(front < back && nums[front] == nums[front + 1]){
                            front++;
                        }
                        while(front < back && nums[back] == nums[back - 1]){
                            back--;
                        }
                        front++;
                        back--;
                    }else if(currentsum > target){
                        back--;
                    }else{
                        front++;
                    }
                }
            }
        }
        return biglist;
    }
}
