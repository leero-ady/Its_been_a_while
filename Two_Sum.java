class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();  
         int x[] = new int[2];
         for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);   
         }
         
        for(int i=0;i<nums.length;i++){
            
            if( hm.containsKey(target - nums[i]) == true && hm.get(target - nums[i]) != i ){
                x[0] = i;
                x[1] = hm.get(target-nums[i]);    

                return x;
            }
            
        }        
        
        
        return x;
    }
}
