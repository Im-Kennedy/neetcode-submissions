class Solution {
    public int characterReplacement(String s, int k) {

        int[] charCount = new int[26];
        int start = 0;
        int maxFreq = 0;
        int maxLength = 0;
        
        for(int end = 0; end < s.length(); end++){//end iter
            charCount[s.charAt(end) - 'A']++;//increment each letter
            maxFreq = Math.max(maxFreq, charCount[s.charAt(end) - 'A']);
            //get the highest frequency

            while((end - start + 1) - maxFreq > k){
                charCount[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}