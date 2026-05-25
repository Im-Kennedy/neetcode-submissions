class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> biglist = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<String,List<String>>();
        for(String word : strs){
            String onekey = "";
            int[] count = new int[26];//make array for alphabet count
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                int index = c - 'a';
                count[index]++;
            }
            for(int j = 0; j < count.length; j++){
                onekey = onekey + "#" + count[j];
            }
            if(map.containsKey(onekey)){
                List<String> listmap = map.get(onekey);
                listmap.add(word);
            }else{
                List<String> listmap = new ArrayList<>();
                listmap.add(word);
                map.put(onekey,listmap);
            }
        }
        for(List<String> thing : map.values()){
            biglist.add(thing);
        }
        return biglist;
    }
}
