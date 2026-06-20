class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        if(s1.length() > s2.length() || s2.length() == 0){
            return false;
        }
        if(s1.length() == 0){
            return true;
        }

        int[] charcount = new int[26];
        int[] charcount2 = new int[26];
        int start = 0;

        for(int i = 0; i < s1.length(); i++){
            charcount[s1.charAt(i) - 'a']++;//increment the letter
            charcount2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(charcount, charcount2)){
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++){//slide window
            charcount2[s2.charAt(i) - 'a']++; //add on letter
            charcount2[s2.charAt(i - s1.length()) - 'a']--; //remove left character
            if(Arrays.equals(charcount, charcount2)){
                return true;
            }
        }
        return false;
    }
}
