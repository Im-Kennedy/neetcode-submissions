class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            int half = nums.length;
            System.out.println(half);
            array[i] = nums[i];
            array[i+half] = nums[i];
        }
        return array;
        }
}