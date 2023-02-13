    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
     DoublyLinkedListNode current=llist;
       DoublyLinkedListNode temp=null;
       DoublyLinkedListNode  prev=null;
       if(llist==null || llist.next==null){
           return llist;
       }
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        llist=temp.prev;
        return llist;
    }
}
