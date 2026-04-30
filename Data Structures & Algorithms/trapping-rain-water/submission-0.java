class Solution {
    public int trap(int[] height) {

        if( height == null || height.length==0) return 0;

        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int maxSoFar=0;
        
        for(int i =0;i<n;i++){
            maxLeft[i]= maxSoFar;
            maxSoFar = Math.max(height[i],maxSoFar);

        }
        maxSoFar=0;
        for(int i=n-1 ; i>=0; i--){
            maxRight[i]= maxSoFar;
            maxSoFar = Math.max(height[i],maxSoFar);

        }
        int trappedWater =0;
        for(int i=0;i<n;i++){
            trappedWater += Math.max(0,Math.min(maxLeft[i],maxRight[i]) -height[i]);
        }
        return trappedWater;
        
    }
}
