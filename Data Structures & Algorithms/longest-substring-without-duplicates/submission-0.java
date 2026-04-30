class Solution {
    public int lengthOfLongestSubstring(String s) {
            if(s==null || s.length()==0) return 0;
            int left=0,maxLen =0;
            HashSet<Character> seen = new HashSet<>();

            for(int right=0; right<s.length();right++){

                while(seen.contains(s.charAt(right))){
                    seen.remove(s.charAt(left));
                    left++;
                    

                }
                seen.add(s.charAt(right));
                maxLen = Math.max(maxLen,right-left+1);



            }


            return maxLen;

           }
}
