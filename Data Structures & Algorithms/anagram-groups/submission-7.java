class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> biglist = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String word : strs){//loop through list of words
            int[] array = new int[26];//make array
            String key = "";//make key
            for(int i = 0; i < word.length(); i++){//loop through letters in the word
                char letter = word.charAt(i);//get character
                int index = letter - 'a';//get index
                array[index]++;//increment index
            }
            for(int j = 0; j < array.length; j++){
                key = key + "#" + array[j];
            }
            if(map.containsKey(key)){
                List<String> currentkey = map.get(key);
                currentkey.add(word);
            }else{
                List<String> currentkey = new ArrayList<>();
                currentkey.add(word);
                map.put(key, currentkey);
            }
        }
        for(List<String> words : map.values()){
            biglist.add(words);
        }
        return biglist;
    }
}
