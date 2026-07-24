/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head ==null) return null;
        Node curr = head;
        while(curr!=null){
            if(curr.child ==null){
                curr = curr.next;
                continue;
            }
            Node next = curr.next;
            Node childHead = flatten(curr.child);
            curr.next = childHead;
            childHead.prev = curr;
            curr.child = null;

            Node tail = childHead;
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = next;
            if(next!=null){
                next.prev = tail;
            }

            curr = next;
        }
        return head;
    }
}