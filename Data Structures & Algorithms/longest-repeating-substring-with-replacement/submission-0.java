class Solution {
    public int characterReplacement(String s, int k) {
        
        if(s==null||s.length()==0) return 0;

        int maxFreq = 0;
        int maxLen  = 0;
        int left = 0;

        int [] charsCount = new int[26];

        for(int right = 0; right<s.length();right++){
            char chr  = s.charAt(right);
            charsCount[chr-'A']++;
            maxFreq = Math.max(maxFreq,charsCount[chr-'A']);

            int windowLen = right-left+1;

            while(windowLen-maxFreq>k){

                char chl = s.charAt(left);
                charsCount[chl-'A']--;
                left++;
                windowLen = right-left+1;

            }

            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;

    }
}
