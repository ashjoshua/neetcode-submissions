class Solution {

    public String encode(List<String> strs) {
       
       if( strs == null || strs.size() ==0)  return  new String("");
       StringBuilder res = new StringBuilder();
       for(String str : strs){

            res.append(str.length());
            res.append("#");
            res.append(str);


       }
       return res.toString();

    }

    public List<String> decode(String str) {
     
        List<String> res = new ArrayList<>();
        int i = 0;

        while(i< str.length()){
            int j = i;

            while(str.charAt(j)!= '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            int end = start+length;

            res.add(new String(str.substring(start,end)));
            i = end;
            


        }

    return res;

    }
}
