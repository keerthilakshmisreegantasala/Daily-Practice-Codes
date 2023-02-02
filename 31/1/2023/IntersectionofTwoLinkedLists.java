public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        if(headA==null && headB==null){
            return null; 
        }
        while(A!=B){
            if(A!=null){
              A=A.next;
            }
            else{
                A=headB;
            }
            if(B!=null){
                B=B.next;
            }
            else{
                B=headA;
            }
        }
        return B;
    }
}
        
