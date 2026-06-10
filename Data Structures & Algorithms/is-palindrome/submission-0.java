class Solution {
    public boolean isPalindrome(String s) {
        String fixed = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed = fixed + c;
            }
        }

        fixed = fixed.toLowerCase();

        int front = 0;
        int back = fixed.length() - 1;
        while(front <= back){
            if(fixed.charAt(front) != fixed.charAt(back)){
                return false;
            }
            front++;
            back--;
        }

        return true;
    }
}
