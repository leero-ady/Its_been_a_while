class Solution {
    public int maxSubArray(int[] nums) {
        int max_ending_here=0;
        int max_sum=Integer.MIN_VALUE;
        boolean all_negative =true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                all_negative=false;
        }
        if(!all_negative){
            for(int i=0;i<nums.length;i++){

                max_ending_here += nums[i];
                if(max_ending_here<0)
                    max_ending_here=0;
                if(max_sum<max_ending_here)
                    max_sum= max_ending_here;
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                max_ending_here = nums[i];

                if(max_sum<max_ending_here)
                    max_sum= max_ending_here;
            }
            
            
        }
        
        return max_sum;
        
        
    }
}
