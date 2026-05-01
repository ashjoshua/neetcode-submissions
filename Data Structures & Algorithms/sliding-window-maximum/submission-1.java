class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( nums==null || nums.length==0 ) return new int[] {0};
        int n = nums.length;
        int[] res = new int[n-k+1];
        int left = 0;
        int maxIndex = -1;
        int maxVal = Integer.MIN_VALUE;
        for(int right = 0; right<n; right++){
            if(nums[right]>maxVal){
                maxVal = nums[right];
                maxIndex = right;
            }

            if(right-left+1 ==k) {
                if(maxIndex<left){
                      maxIndex = left;
                      maxVal = nums[left]; 
                      for(int i =left; i<=right;i++){
                            if(nums[i]>maxVal){
                                maxVal = nums[i];
                                maxIndex = i;
                            }
                      }
                }
                res[left] = maxVal;
                left++;
            }
       }

            return res;


    }
}
