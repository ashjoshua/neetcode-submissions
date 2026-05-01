class Solution {
    public boolean isValid(String s) {

        if( s==null || s.length() == 0) return false;
        Stack<Character> stackSym = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c == '[' || c =='{' ){
                stackSym.push(c);

            } else if (c == ')' || c == ']' || c =='}') {
                if(stackSym.isEmpty()) return false;
                 char cPop =stackSym.pop();

                if((cPop =='(' && c != ')') ||
                (cPop =='[' && c != ']') ||
                (cPop =='{' && c != '}') ) {
                    return false;
                }

            }
            


        }
        return stackSym.isEmpty();
        
    }
}
