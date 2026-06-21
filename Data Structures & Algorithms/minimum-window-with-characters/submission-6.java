class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() == 0 || t.length() == 0){
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char mapchar = t.charAt(i);
            map.put(mapchar, map.getOrDefault(mapchar, 0) + 1);
        }

        int j = 0;
        int i = 0;
        int left = 0;
        int right = s.length() - 1;
        int min = s.length() + 1;
        int count = map.size();
        boolean found = false;

        while(j < s.length()){
            char endchar = s.charAt(j++);
            if(map.containsKey(endchar)){
                map.put(endchar, map.get(endchar) - 1);
                if(map.get(endchar) == 0){
                    count = count - 1;
                }
            }

            if(count > 0){
                continue;
            }

            while(count == 0){
                if(j - i < min){
                    left = i;
                    right = j;
                    min = j - i;
                    found = true;
                    
                }

                char startchar = s.charAt(i++);
                if(map.containsKey(startchar)){
                    map.put(startchar, map.get(startchar) + 1);
                        if(map.get(startchar) > 0){
                        count = count + 1;
                    }
                }
            }
        }
        if(found == false){
            return "";
        }else{
            return s.substring(left, right);
        }
    }
}
