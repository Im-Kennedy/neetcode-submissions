class Solution {
    public boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                list.push(currentChar);
            }else if(currentChar == ')' && !list.isEmpty() && list.peek() == '('){
                list.pop();
            }else if(currentChar == '}' && !list.isEmpty() && list.peek() == '{'){
                list.pop();
            }else if(currentChar == ']' && !list.isEmpty() && list.peek() == '['){
                list.pop();
            }else{
                return false;
            }
        }
        if(!list.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
