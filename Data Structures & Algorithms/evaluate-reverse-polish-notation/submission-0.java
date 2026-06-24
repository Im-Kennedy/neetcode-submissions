class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> returnstack = new Stack<>();
        int sum = 0;
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int num2 = returnstack.pop();
                int num1 = returnstack.pop();
                if(token.equals("+")){
                    sum = num1 + num2;
                    returnstack.push(sum);
                }else if(token.equals("-")){
                    sum = num1 - num2;
                    returnstack.push(sum);
                }else if(token.equals("*")){
                    sum = num1 * num2;
                    returnstack.push(sum);
                }else if(token.equals("/")){
                    sum = num1 / num2;
                    returnstack.push(sum);
                }
            }else{
                returnstack.push(Integer.parseInt(token));
            }
        }
        return returnstack.pop();
        
    }
}
