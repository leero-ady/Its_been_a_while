class Solution {
    public int climbStairs(int n) {
        int first_fib=1;
        int second_fib=2;
        int fibonacci = 0;
        if(n<2)
            return first_fib;
        for(int i=3;i<=n;i++){
            fibonacci = second_fib+first_fib;
            first_fib= second_fib;
            second_fib = fibonacci;
            
            
        }
        
        return second_fib;
        
    }
}
