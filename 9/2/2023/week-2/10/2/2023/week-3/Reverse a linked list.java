public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    SinglyLinkedListNode next = null;
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode previous = null;
        while(current!=null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        llist= previous;
        return llist;
    }

    }
