package shail.linkedlist;

public class FindMiddleNode {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println(findMiddleNode(l1));

    }

    public static ListNode findMiddleNode(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode current = head;
        ListNode halfCurrent = head;

        while(current != null && current.next != null && current.next.next != null)
        {
            current = current.next.next;
            halfCurrent = halfCurrent.next;

        }

        return halfCurrent;

    }

    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }


        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }
}
