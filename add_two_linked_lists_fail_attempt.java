class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long x=0,y=0;
        double digitcounter=0;
        if(l1==null&&l2==null)
            return null;
        while(l1!=null){
            
           x += l1.val* Math.pow(10.0,digitcounter);
            digitcounter++;
            l1=l1.next;
        }
         digitcounter =0;
        while(l2!=null){
            
           y += l2.val* Math.pow(10.0,digitcounter);
            digitcounter++;
            l2=l2.next;
        }
        
        long z =0;
        z= x+y;
        
        System.out.println(z);
        if((x+y)==0){
            
            ListNode l3 = new ListNode(0);
            l3.next=null;
            return l3;
        }
        
        ListNode l3=null;
        ListNode temp=null;
        if(z!=0){
            l3 = new ListNode(z%10); 
            temp = l3;
            temp.next=null;
        }
        z=z/10;
        
        while(z!=0){
            temp.next = new ListNode(z%10);
            temp.next.next=null;
            temp=temp.next;
            z=z/10;
        }
        return l3;
    }
}
