class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        if(len-n+1==1){
            return head.next;
        }
        curr=head;
        int i=0;
        while(curr!=null){
            i=i+1;
            if(i==len-n){
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }
        return head;
            
        
    }
}
