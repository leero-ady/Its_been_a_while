/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode temp1=null;
        ListNode temp2=head;
        while(temp2!=null){
            ListNode temp = temp2.next;
            temp2.next=temp1;
            temp1=temp2;
            temp2=temp;
        }
        return temp1;
        
    }
    
}
