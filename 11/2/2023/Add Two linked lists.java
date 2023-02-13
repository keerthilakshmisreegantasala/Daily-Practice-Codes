 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carr = 0, sum;
        ListNode h = new ListNode(0);
        ListNode list1 = l1, list2 = l2, node = h;
        
        while (carr != 0 || list1 != null || list2 != null) {
            sum = carr; 
            
            if (list1 != null) {
                  sum =sum+ list1.val;
                  list1 = list1.next;
            }
            if (list2 != null) {
                  sum += list2.val;
                  list2 = list2.next;
            }
            
            carr = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next; 
        }
        return h.next;    
    }
}
