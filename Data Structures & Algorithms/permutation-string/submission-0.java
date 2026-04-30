class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1==null||s2==null) return false;
        if(s2.length()<s1.length()) return false;
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

       for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i)-'a']++;
            windowCount[s2.charAt(i)-'a']++;
       }
       if(Arrays.equals(s1Count,windowCount)) return true;
       int left=0;
       for(int right = s1.length(); right<s2.length();right++){
            windowCount[s2.charAt(right)-'a']++;
            left = right-s1.length();
            windowCount[s2.charAt(left)-'a']--;
            if(matches(windowCount,s1Count)) return true;    

       }
        return false;
    }

    public boolean matches(int[] first, int[] second){
        for(int i =0; i<26; i++){

            if(first[i]!=second[i]) return false;
        }
        return true;

    }
}
