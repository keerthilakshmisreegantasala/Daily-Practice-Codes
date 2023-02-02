class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextnode=node.next;
        node.val= nextnode.val;
        node.next=node.next.next;
        
    }
}
