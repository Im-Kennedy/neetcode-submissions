class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0){
            return null;
        }
        int[] returnarray = new int[2];
        int front = 0;
        int back = numbers.length - 1;
        while(front <= back){
            int sum = numbers[front] + numbers[back];
            if(sum == target){
                returnarray[0] = front + 1;
                returnarray[1] = back + 1;
                break;
            }else if(sum > target){
                back--;
            }else if(sum < target){
                front++;
            }
        }
        return returnarray;
    }
}
