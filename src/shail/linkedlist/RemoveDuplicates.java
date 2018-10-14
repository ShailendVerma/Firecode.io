package shail.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(removeDuplicates(l1));

    }

    public static ListNode removeDuplicates(ListNode head) {

        if(head == null) return head;

        Set<Integer> values = new HashSet<>();
        ListNode currentNode = head;

        while(currentNode != null)
        {
            System.out.println(currentNode);
            values.add(currentNode.data);
            while(currentNode.next!= null && values.contains(currentNode.next.data))
            {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;

        }

        return head;
    }
}
