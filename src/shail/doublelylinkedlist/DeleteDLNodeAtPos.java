package shail.doublelylinkedlist;

public class DeleteDLNodeAtPos {

    public static void main(String args[])
    {
        DoublyLinkedNode l1 = new DoublyLinkedNode(1);
        DoublyLinkedNode l2 = new DoublyLinkedNode(2);
        DoublyLinkedNode l3 = new DoublyLinkedNode(3);
        DoublyLinkedNode l4 = new DoublyLinkedNode(4);

        l1.next =l2;
        l2.prev = l1;
        l2.next = l3;
        l3.prev = l2;
        l3.next = l4;
        l4.prev = l3;

        DoublyLinkedNode head = deleteAtPos(l1,1);
        System.out.println(head);


    }

    public static DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {


        if(head == null) return head;

        DoublyLinkedNode current = head;
        int currPos = 1;
        while (current != null)
        {
            if(pos == currPos)
            {
                if(current.prev == null)
                {
                    head = current.next;
                }else{
                    current.prev.next = current.next;
                }
                if(current.next != null) {current.next.prev = current.prev;}
                current.next = null;
                current.prev = null;

                return head;
            }
            currPos ++;
            current = current.next;
        }

        return head;

    }
}
