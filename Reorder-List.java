1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12
13    public ListNode reverse(ListNode head){
14        if(head ==null || head.next == null) return head;
15        ListNode prev= null;
16        ListNode curr= head;
17
18        while(curr!= null){
19            ListNode next = curr.next;
20            curr.next = prev;
21            prev= curr;
22            curr= next;
23        }
24        return prev;
25    }
26    public void reorderList(ListNode head) {
27        if(head == null || head.next ==null) return;
28        ListNode slow= head;
29        ListNode fast = head;
30        while(fast!=null && fast.next!=null){
31            slow = slow.next;
32            fast = fast.next.next;
33        }
34        ListNode mid = reverse(slow.next);
35        slow.next = null;
36        ListNode curr = head;
37        while(curr!=null && mid!=null){
38            ListNode next = curr.next;
39            ListNode midNext = mid.next;
40            curr.next= mid;
41            mid.next = next;
42            curr = next;
43            mid = midNext;
44        }
45        return;
46    }
47}