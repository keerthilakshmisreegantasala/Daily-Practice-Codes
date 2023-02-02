class Solution {
    public ListNode removeElements(ListNode head, int val) {
       while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next != null) {
            ListNode nextNode = temp.next;
            if (nextNode.val == val) {
                temp.next = nextNode.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
