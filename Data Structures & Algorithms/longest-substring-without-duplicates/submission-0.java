class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        int count = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> map = new HashSet<Character>();
        while(right < s.length()){
            if(!map.contains(s.charAt(right))){
                map.add(s.charAt(right));
                right++;
                count = Math.max(map.size(), count);
            }else{
                map.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
