/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        int val;
        if(l1==null && l2==null)
            return null;
        else if(l1==null &&l2!=null)
            return l2;
        else if(l1!=null &&l2==null)
            return l1;
        
        if(l1!=null && l2!=null && l1.val > l2.val){
           val = l2.val;
           l2=l2.next;
        }
        else{
            val = l1.val;
            l1=l1.next;
        }
        
        ListNode l3 = new ListNode(val);
        ListNode temp = l3;
        temp.next=null;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                temp.next = new ListNode(l2.val);
                temp =temp.next;
                temp.next=null;
                l2 = l2.next;
            }
            else{
                temp.next = new ListNode(l1.val);
                temp =temp.next;
                temp.next=null;
                l1=l1.next;
            }
            
        }
        if(l1==null){
            
            while(l2!=null){
                temp.next = new ListNode(l2.val);
                temp =temp.next;
                temp.next=null;
                l2=l2.next;
            }
            
        }
        else if(l2 ==null){
            while(l1!=null){
                temp.next = new ListNode(l1.val);
                temp =temp.next;
                temp.next=null;
                l1=l1.next;
            }
        }
        
        
        return l3;
            
        
        
        
    }
}
