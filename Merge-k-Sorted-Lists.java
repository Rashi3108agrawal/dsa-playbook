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
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);
14
15        for(ListNode node: lists){
16             if (node != null) {
17                pq.add(node);
18            }
19        }
20        ListNode dummy = new ListNode(-1);
21        ListNode curr = dummy;
22        while(!pq.isEmpty()){
23            ListNode n  = pq.poll();
24            curr.next = n;
25            curr = curr.next;
26            if(n.next!=null){
27                pq.add(n.next);
28            }
29        }
30        return dummy.next;
31    }
32}