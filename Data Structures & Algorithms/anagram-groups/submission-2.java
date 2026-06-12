class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> biglist = new ArrayList<>();// big reutrn list
        HashMap<String, List<String>> map = new HashMap<String,List<String>>();
        for(String word : strs){//loop through strings
           String key = "";
           int[] alphabet = new int[26];
           for(int i = 0; i < word.length(); i++){//go through word
            char c = word.charAt(i);//get char
            int index = c - 'a';
            alphabet[index]++;
           }
           for(int j = 0; j < alphabet.length; j++){
            key = key + "#" + alphabet[j];
           }
           if(map.containsKey(key)){
            List<String> listmap = map.get(key);
            listmap.add(word);
           }else{
            List<String> listmap = new ArrayList<String>();
            listmap.add(word);
            map.put(key, listmap);
           }
        }
        for(List<String> list : map.values()){
            biglist.add(list);
        }
        return biglist;

    }
}
