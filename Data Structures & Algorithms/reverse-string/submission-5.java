class Solution {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length -1;
        while(first < last){
            if(s.length <= 2){
                char temp = s[first];
                s[first] = s[last];
                s[last] = temp;
                break;
            }
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }
}