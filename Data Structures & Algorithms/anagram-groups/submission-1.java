class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> biglist = new ArrayList<>();//big list
        
        HashMap<String, List<String>> map = new HashMap<String,List<String>>();//hashmap
        for(String word : strs){//loop through given array of strings
            String onekey = "";//key
            int[] count = new int[26];//make array for alphabet count
            for(int i = 0; i < word.length(); i++){//loop through each word
                char c = word.charAt(i);//get letter/
                int index = c - 'a';//calculate index
                count[index]++;//increment index/
            }
            for(int j = 0; j < count.length; j++){//loop through letter array
                onekey = onekey + "#" + count[j];//convert to string
            }
            if(map.containsKey(onekey)){//check if map has string key
                List<String> listmap = map.get(onekey);//if it does, get current list
                listmap.add(word);//then add current word
            }else{
                List<String> listmap = new ArrayList<>();//if not make new list
                listmap.add(word);//add word in list
                map.put(onekey,listmap);//then add keky to map
            }
        }
        for(List<String> thing : map.values()){//loop through array list in the map
            biglist.add(thing);//add the list of strings to the big list.
        }
        return biglist;//return big list
    }
}
