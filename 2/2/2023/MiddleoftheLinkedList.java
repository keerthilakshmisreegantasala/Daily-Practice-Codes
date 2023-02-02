class Solution {
    public ListNode middleNode(ListNode head) {
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int mid=len/2;
        curr=head;
        for(int i=0;i<mid;i++){
            curr=curr.next;
        }
        return curr;
        
    }
}
