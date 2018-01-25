class Solution {
    public String countAndSay(int n) {
        
        String start = "1";
        String result="";

        if(n==0)
            return result;
        if(n==1)
            return start;
        for(int i=0;i<n-1;i++){
            char digit=start.charAt(start.length()-1);
            char digitnext;
            int count=1;
            
            
            for(int j=String.valueOf(start).length()-2;j>=0 ;j--){
                digitnext = start.charAt(j);
                if(digitnext == digit ){
                    count++;
                }
                else{
                    result = Integer.toString(count)+Character.toString(digit )+result;
                    digit=digitnext;
                    count=1;
                }
                
            }
            result = Integer.toString(count)+Character.toString(digit )+result;

            start = result;
            result="";
        }
        return start;
        
    }
}
