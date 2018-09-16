package shail.linkedlist;

public class InsertAtHead {


    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println(insertAtHead(l1,0));



    }

    public static ListNode insertAtHead(ListNode head, int data) {

        ListNode newHead = new ListNode(data);

        newHead.next = head;

        return newHead;

    }

    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
