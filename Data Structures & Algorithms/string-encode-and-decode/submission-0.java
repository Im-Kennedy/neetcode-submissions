class Solution {

    public String encode(List<String> strs) {
        String onestring = "";
        for(String word : strs){
            onestring = onestring + word.length() + "#" + word;
        }
        return onestring;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<String>();
        int index = 0;
        while(index < str.length()){
            int poundIndex = str.indexOf("#", index);
            String lengthString = str.substring(index, poundIndex);
            int length = Integer.parseInt(lengthString);
            int wordStart = poundIndex + 1;
            String word = str.substring(wordStart, (wordStart + length));
            list.add(word);
            index = (wordStart + length);
        }

        return list;
    }
}
