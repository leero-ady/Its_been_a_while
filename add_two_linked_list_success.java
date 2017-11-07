/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3 = null;
        ListNode temp=null;
        if(l1==null&&l2==null)
            return null;
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        int carry= (l1.val+l2.val)/10;
        int value = (l1.val + l2.val)%10;
        l3=new ListNode(value);
        temp=l3;
        if(carry>0)
            temp.next=addTwoNumbersHelper(l1.next,l2.next,carry);
        else
            temp.next=addTwoNumbers(l1.next,l2.next);
       
        return l3;    
        
        
    }
    
    public ListNode addTwoNumbersHelper(ListNode l1,ListNode l2,int carry){
        ListNode l3 = null;
        ListNode temp=null;
        int value=0;
        if(l1==null&&l2==null&&carry!=0){
            l3=new ListNode(carry);
            l3.next=null;
            return l3;
        }
        if(l1==null){
            
            value = (l2.val+carry)%10;
            carry= (l2.val+carry)/10;
            l3=new ListNode(value);
            temp=l3;
            if(carry>0)
                temp.next=addTwoNumbersHelper(null,l2.next,carry);
            else
                temp.next=addTwoNumbers(null,l2.next);
        }
        else if(l2==null){
            value = (l1.val+carry)%10;
            carry= (l1.val+carry)/10;
            l3=new ListNode(value);
            temp=l3;
            if(carry>0)
                temp.next=addTwoNumbersHelper(l1.next,null,carry);
            else
                temp.next=addTwoNumbers(l1.next,null);
        }
        else{
            value= (l1.val+l2.val+carry)%10;
            carry= (l1.val+l2.val+carry)/10;
            l3=new ListNode(value);
            temp=l3;
            if(carry>0)
                temp.next=addTwoNumbersHelper(l1.next,l2.next,carry);
            else
                temp.next=addTwoNumbers(l1.next,l2.next);
        }
        
        return l3;     
        
    }
}
