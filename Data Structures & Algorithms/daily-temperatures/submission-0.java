class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> returnstack = new Stack<>();
        int[] returnarray = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            if(i == 0){
                returnstack.push(i);
            }
            while(!returnstack.isEmpty() && temperatures[i] > temperatures[returnstack.peek()]){
                int index = returnstack.pop();
                returnarray[index] = i - index;
            }
            returnstack.push(i);

        }
        return returnarray;
    }
}
