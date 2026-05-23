class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer>map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer>map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char currentchar = s.charAt(i);
            char currentchar2 = t.charAt(i);
            if(map1.containsKey(currentchar)){
                int count = map1.get(currentchar);
                map1.put(currentchar, count + 1);
            }else{
                map1.put(currentchar, 1);
            }
            if(map2.containsKey(currentchar2)){
                int count2 = map2.get(currentchar2);
                map2.put(currentchar2, count2 + 1);
            }else{
                map2.put(currentchar2, 1);
            }
            
        }
        if(map1.equals(map2)){
                return true;
            }
        return false;
    }
}
