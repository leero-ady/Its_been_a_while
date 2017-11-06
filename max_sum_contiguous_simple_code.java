class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        int max_ending_here=nums[0];
        int max_sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            max_ending_here = Math.max(max_ending_here+nums[i],nums[i]);
            max_sum = Math.max(max_ending_here,max_sum);
            
        }
        
        return max_sum;
    }
}
