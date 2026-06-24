class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '[' || bracket == '{'){
                stack.push(bracket);
            }else if( bracket == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(bracket == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(bracket == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
