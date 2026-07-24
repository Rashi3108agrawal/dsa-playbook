/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int length(ListNode head){
        int len =0;
        while(head!= null){
            len++;
            head= head.next;
        }
        return len;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)   return head;
        int len = length(head);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr;
        ListNode nex;

        while(len >= k){
           curr = pre.next;
           nex = curr.next; 
            for(int i=1;i<k;i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            len-=k;
        }
        return dummy.next;
    }
}