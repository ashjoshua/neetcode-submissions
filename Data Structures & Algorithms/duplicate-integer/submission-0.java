class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length <=1){
            return false;
        }

        HashSet<Integer> checkDups = new HashSet<>();
        for(int num : nums){
               if(checkDups.contains(num)) {
                return true;
               } else {
                checkDups.add(num);
               }

        }
        return false;


        
    }
}