class Solution {
    public boolean isAnagram(String s, String t) {


        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> charCount = new HashMap<>();

        for(char c : s.toCharArray()){

            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){

            if(! charCount.containsKey(c) || charCount.get(c) ==0 ) {
                return false;
            } else {
                charCount.put(c,charCount.getOrDefault(c,0)-1);
            }
        }
        return true;


        

    }
}
