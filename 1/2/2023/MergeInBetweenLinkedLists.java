class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=list1;
        for(int i=1;i<a;i++){
            curr=curr.next;
        }
        ListNode d1=curr.next;
        curr.next=list2;
        for(int i=0;i<b-a+1;i++){
            d1=d1.next;
        }
        ListNode d2=lastnode(list2);
        d2.next=d1;
        return list1;
    }
    private ListNode lastnode(ListNode node){
        ListNode curr=node;
        while(curr.next!=null){
            curr=curr.next;
        }
        return curr;
    }

}
