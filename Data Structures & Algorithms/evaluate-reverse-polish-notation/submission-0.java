class Solution {
    public int evalRPN(String[] tokens) {

        if(tokens==null ||tokens.length==0) return 0;
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")|| s.equals("-")|| s.equals("/") || s.equals("*")){
                int second = stack.pop();
                int first = stack.pop();
                if(s.equals("+")) {
                    int res = first + second;
                    stack.push(res);
                }
                if(s.equals("-")) {
                    int res = first - second;
                    stack.push(res);
                }
                
                if(s.equals("/")) {
                    int res = first / second;
                    stack.push(res);
                }
                
                if(s.equals("*")) {
                    int res = first * second;
                    stack.push(res);
                }

            } else {

                stack.push(Integer.parseInt(s));

            }

        }

        return stack.peek();


        
    }
}
