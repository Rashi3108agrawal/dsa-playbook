class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead so slow stops right before the node to remove
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the nth node
        slow.next = slow.next.next;

        return dummy.next; // Return new head
    }
}
