package shail.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FindNthNodeFromEnd {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        System.out.println(findNthNodeFromEnd(l1,0));

    }

    public static ListNode findNthNodeFromEnd(ListNode head, int n) {

        if(head == null) return head;
        Map<Integer,ListNode> map = new HashMap<>();
        ListNode current = head;
        int i =1;

        while (current != null)
        {
            map.put(i,current);
            current = current.next;
            i++;
        }


        return (i > n)?map.get(i - n):null;

    }
}
