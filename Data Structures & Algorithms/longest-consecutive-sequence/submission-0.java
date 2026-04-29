class Solution {
    public int longestConsecutive(int[] nums) {


        if(nums == null || nums.length ==0) return 0;

        HashSet<Integer> numsSet = new HashSet<>();

        for(int num : nums){

            numsSet.add(num);
        }
        int maxSeq = 0;
        int seq = 0;
        for(int i = 0; i<nums.length;i++){

            if(numsSet.contains(nums[i]-1)){

                continue;
            } 
            int x = nums[i];
            while(numsSet.contains(x)){
                x++;
                seq++;
            }
            maxSeq = Math.max(maxSeq,seq);
            seq=0;

        }
        return maxSeq;
    }
}
