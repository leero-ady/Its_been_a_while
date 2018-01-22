/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode temp = head;
        int length=0;
        String x="";
        ListNode reverseHead=null;
        
        ListNode slowPtr=null,fastPtr =null;
        
        if(temp==null || temp.next==null)
            return true;
        
        if(temp.next!=null){
            slowPtr= temp.next;
            fastPtr=temp.next.next;
        }
            
        while( fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr=fastPtr.next.next;
            
        }
        
        if(fastPtr == null){
            reverseHead = reverseList(slowPtr);
        }
        else if(fastPtr.next==null){
            reverseHead = reverseList(slowPtr.next);
        }
        
        while(reverseHead!=null&&temp!=null){
            
            if(temp.val!=reverseHead.val)
                return false;
            
            reverseHead = reverseHead.next;
            temp=temp.next;
            
        }
        
        return true;
    }
    
    ListNode reverseList(ListNode head){
        
        if(head.next == null || head==null)
            return head;
        ListNode t1=null;
        ListNode t2=head;
        
        while(t2!=null){
            ListNode temp = t2.next;
            t2.next = t1;
            t1=t2;
            t2=temp;
            
        }
        return t1;
        
    }
}
