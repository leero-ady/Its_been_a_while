class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;
        
        int max_diff=prices[1]-prices[0];
        int min_elem = prices[0];
        
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]-min_elem>max_diff)
                max_diff = prices[i] - min_elem;
            
            if(prices[i]<min_elem)
                min_elem=prices[i];
        }
        
        if(max_diff>0)
            return max_diff;
        else
            return 0;
    }
}
