package shail.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IsCyclicLinkedList {

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

        System.out.println(isCyclic(l1));

    }

    public static Boolean isCyclic(ListNode head) {

        if(head == null || head.next == null) return false;

        Set<Integer> values = new HashSet<>();
        ListNode current = head;
        while (current != null)
        {
            if(values.contains(current.data)) return true;
            values.add(current.data);
            current = current.next;
        }

        return  false;

    }
}
