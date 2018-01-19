class Solution {
    public int rob(int[] nums) {
        int prevIncluded=0;
        int prevNotIncluded=0;
        for(int i=0;i<nums.length;i++){
            int currIncluded  = prevNotIncluded+nums[i];
            int currNotIncluded = Math.max(prevIncluded,prevNotIncluded);
            prevIncluded=currIncluded;
            prevNotIncluded=currNotIncluded;
        }
       
        
        return Math.max(prevNotIncluded,prevIncluded);
    }
    
}
