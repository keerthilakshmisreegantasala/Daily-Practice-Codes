class Solution {
    public int pairSum(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        mid.next=reverse(mid.next);
        ListNode start=head;
        ListNode end=mid.next;
        int max=0;
        while(start!=null&&end!=null){
            max=Math.max(max,start.val+end.val);
            start=start.next;
            end=end.next;
        }
        return max;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }



        
    
}
