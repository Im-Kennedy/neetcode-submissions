class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int thing : asteroids){
            boolean gone = false;
            while(!stack.isEmpty() && thing < 0 && stack.peek() > 0){
                if(stack.peek() < Math.abs(thing)){
                    stack.pop();
                }else if(stack.peek() == Math.abs(thing)){
                    stack.pop();
                    gone = true;
                    break;
                }else{
                    gone = true;
                    break;
                }
            }
            if(!gone){
                stack.push(thing);
            }
        }
        int size = stack.size();
        int[] arr = new int[size];
        for(int i = size - 1; i >= 0; i--){
            arr[i] = stack.pop();
        }
        return arr;
    }
}