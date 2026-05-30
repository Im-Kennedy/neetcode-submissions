class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] returnarray = new int[k];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count+1);
            }else{
                map.put(nums[i], 1);
            }
            
        }
        for(int j = 0; j < k; j++){
        int maxFrequency = 0;
        int maxNumber = 0;
            for(Integer key: map.keySet()){
            int frequency = map.get(key);
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                maxNumber = key;
            }
        }
        returnarray[j] = maxNumber;
        map.remove(maxNumber);

    }
        
        return returnarray;
    }
}
