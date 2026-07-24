/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            hm.put(temp, new Node(temp.val));
            temp= temp.next;
        }
        Node nHead = hm.get(head);
        temp = head;
        Node ntemp = nHead;
        while(temp!=null){
            ntemp.next = hm.get(temp.next);
            ntemp.random = hm.get(temp.random);
            temp = temp.next;
            ntemp = ntemp.next;
        }
        return nHead;
    }
}