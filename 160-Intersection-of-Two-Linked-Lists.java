/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode c1 = headA;
        ListNode c2 = headB;
        while(c1!= c2){
            c1 = c1== null? headB: c1.next;
            c2 = c2 == null? headA: c2.next;
        }
        return c1;
    }
}