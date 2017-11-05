class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        if(s.length()%2 !=0)
            return false;
       Stack st = new Stack();
       for( char c:s.toCharArray()){
           
           if(c == '[')
               st.push(']');
           else if(c == '{')
               st.push('}');
           else if(c=='(')
               st.push(')');
           else if(!st.empty() && c!=(char)st.pop())
               return false;
           
       }
        if(st.empty())
            return true;
        else
            return false;
        
    }
}
