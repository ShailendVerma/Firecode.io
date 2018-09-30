package shail.linkedlist;

public class DeleteCircularAtTail {

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

        System.out.println(deleteCircularAtTail(l1));



    }
    
    public static ListNode deleteCircularAtTail(ListNode head) {

        if(head == null) return null;
        if(head.next == null || head.next == head) return head;

        //Find last node before head
        ListNode secondLastNode = head.next;
        while(secondLastNode.next.next != head)
        {
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next.next = null;
        secondLastNode.next = head;

        return head;


    }


}
