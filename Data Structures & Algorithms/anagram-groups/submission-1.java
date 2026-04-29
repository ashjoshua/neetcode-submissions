class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
      if(strs == null || strs.length == 0) return new ArrayList<>();
      HashMap<String,List<String>> map = new HashMap<>();

      for(String str : strs){

            int[] charCounter = new int[26];

            for(char c : str.toCharArray()){

                charCounter[c-'a']++;
            }
            String key = Arrays.toString(charCounter);
            map.computeIfAbsent(key, x-> new ArrayList<>()).add(str);

            
      }
      return new ArrayList<>(map.values());


    }
}
