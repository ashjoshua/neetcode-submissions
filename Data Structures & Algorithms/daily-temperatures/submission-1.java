class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

            if(temperatures == null || temperatures.length==0) return new int[]{0};
            int n = temperatures.length;
            int[] res =  new int[n];
            Stack<Integer> stack = new Stack<>();
            for(int i =0; i<n; i++){
                while(!stack.isEmpty() &&
                temperatures[i]> temperatures[stack.peek()]){
                        int prevIndex = stack.pop();
                        res[prevIndex] = i-prevIndex;

                }
                stack.push(i);


            }

            return res;
        



        
    }
}
