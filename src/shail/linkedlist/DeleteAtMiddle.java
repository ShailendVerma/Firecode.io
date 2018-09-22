package shail.linkedlist;

import java.util.List;

public class DeleteAtMiddle {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println(deleteAtMiddle(l1,7));



    }
    
    public static ListNode deleteAtMiddle(ListNode head , int position) {

        if(head == null || position == 0) return head;
        if(position == 1) return head.next;

        ListNode current = head;
        int index = 2;
        while(current.next != null)
        {
            if(index == position)
            {
                current.next = current.next.next;
                return head;
            }
            index++;
            current = current.next;

        }

        return head;
    }


}
