package shail.linkedlist;

public class IsLengthEven {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println(isListEven(l1));
        
    }

    public static Boolean isListEven(ListNode head) {

        if (head == null) return  true;
        boolean isEven = false;
        while (head.next  != null)
        {
            head = head.next;
            isEven = !isEven;
        }
        return isEven;

    }
}
