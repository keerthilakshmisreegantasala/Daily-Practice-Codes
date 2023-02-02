public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode left=head;
        ListNode right=head;
        while(right!=null && right.next!=null){
            right=right.next.next;
            left=left.next;
            if(left==right){
                return true;
            }
        }
        return false;
    }
}
