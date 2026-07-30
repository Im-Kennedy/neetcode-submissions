class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int min = Math.min(word1.length(), word2.length());
        int index = 0;
        while(index < min){
            str.append(word1.charAt(index));
            str.append(word2.charAt(index));
            index++;
        }
        if(word1.length() > word2.length()){
            str.append(word1.substring(index));
        }
        if(word2.length() > word1.length()){
            str.append(word2.substring(index));
        }
        String result = str.toString();
        return result;
    }
}