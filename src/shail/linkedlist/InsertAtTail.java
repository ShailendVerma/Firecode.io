package shail.linkedlist;

public class InsertAtTail {


    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println(insertAtTail(l1,0).data);



    }

    public static ListNode insertAtTail(ListNode head, int data) {

        ListNode newTail = new ListNode(data);

        if(head == null)
        {
            return newTail;
        }

        ListNode currentNode = head;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newTail;

        return head;

    }

    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
