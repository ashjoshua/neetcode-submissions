class Solution {
    public String minWindow(String s, String t) {


        if(s==null || t==null) return "";
        if(s.length()<t.length()) return "";
        int[] reqCount = new int[128];
        int[] winCount = new int[128];
       

        for(int i = 0; i<t.length();i++){
            reqCount[t.charAt(i)]++;
        }


        int left = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0;right<s.length();right++){
            winCount[s.charAt(right)]++;

            while(matches(winCount,reqCount)){
                int length = right - left + 1;
                if ( length < minLength) {
                    minLength = length;
                    start = left;
                }
                winCount[s.charAt(left)]--;
                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE) return "";

        return s.substring(start,start+minLength);

        
    }
    public boolean matches(int[]winCount , int[] reqCount){

        for(int i  =0; i<128; i++){

            if(winCount[i]<reqCount[i]) return false;
        }        
    return true;

    }
}
