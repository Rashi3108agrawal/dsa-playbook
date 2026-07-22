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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry =0;
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode curr = dummy;
        while(h1!= null && h2!= null){
            int sum  = h1.val + h2.val + carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            h1 = h1.next;
            h2= h2.next;
            curr = curr.next;
        }
        while(h1!=null){
            int sum = h1.val+carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            h1 = h1.next;
            curr = curr.next;
        }
        while(h2!=null){
            int sum = h2.val+carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            h2 = h2.next;
            curr = curr.next;
        }
        if(carry!=0){
            curr.next = new ListNode(carry);
            curr = curr.next;
        }
        return dummy.next;
    }
}