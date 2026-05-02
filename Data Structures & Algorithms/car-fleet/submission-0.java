class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      

      if(position == null || speed == null ||position.length==0 || speed.length==0) return 0;
      int n = position.length;
      int [][] combo = new int[n][2];
      for(int i =0;i<n;i++){
            combo[i][0] = position[i];
            combo[i][1] = speed[i];
      }
      Arrays.sort(combo,(a,b)->Integer.compare(b[0],a[0]));
      int fleets = 0;
      double fleetTime = 0;
      for(int i = 0; i<n;i++){
        int pos = combo[i][0];
        int spd = combo[i][1];
        double currentTime = (double)( target-pos)/spd;
        if(currentTime>fleetTime){
            fleetTime = currentTime;
            fleets++;
        }



      }
      return fleets;
      
      
          }
}
