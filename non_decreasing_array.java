class Solution {
    public boolean checkPossibility(int[] nums) {
        
        int drop=0;
        int dropIndex=0;
        boolean val=false;
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i+1]-nums[i]<0){
                drop++;  
                dropIndex=i+1;
            }
        }
        if(drop>1)
            val= false;
        
        if(drop==1){
            if(dropIndex==1||dropIndex==nums.length-1)
                val=true;
            else if(dropIndex-1>=0&&dropIndex+1<nums.length){
                if(nums[dropIndex+1] - nums[dropIndex-1]>=0){
                    val= true;
                }
                else
                    val = false;
                
                
            }
            if(val==false){
            dropIndex=dropIndex-1;

             if(dropIndex-1>=0&&dropIndex+1<nums.length){
                if(nums[dropIndex+1] - nums[dropIndex-1]>=0){
                    val= true;
                }
                else
                    val = false;                
            }
            }  
            
        }
        if(drop ==0)
            val = true;
        
        return val;
        
    }
}
