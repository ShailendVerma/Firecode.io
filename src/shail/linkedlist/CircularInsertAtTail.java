package shail.linkedlist;

import java.util.LinkedList;

public class CircularInsertAtTail {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l1;

        System.out.println(insertAtTail(l1,5));
    }
    
    public static ListNode insertAtTail(ListNode head, int data) {
        ListNode newTail = new ListNode(data);
        if(head == null) {
            newTail.next = newTail;
            return newTail;}

        newTail.next = head;

        ListNode currentTail = head;
        //Find the tail
        while(currentTail.next != head)
        {
            currentTail = currentTail.next;
        }

        currentTail.next = newTail;

        return head;


    }


}
