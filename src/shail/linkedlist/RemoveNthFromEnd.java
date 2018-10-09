package shail.linkedlist;

public class RemoveNthFromEnd {

    public static void main(String args[])
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next =l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode ret = removeNthFromEnd(l1,7);
        while (ret != null)
        {
            System.out.println(">>"+ret);
            ret = ret.next;
        }



    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null ||  n <= 0 ) return head;

        ListNode lastNode = head;
        ListNode nMinOnethNode = head;
        int index = 0;
        while (lastNode != null)
        {
            System.out.println(index+":"+lastNode+":"+nMinOnethNode);
            if(n < index){
                nMinOnethNode = nMinOnethNode.next;
            }
            index++;
            lastNode = lastNode.next;
        }

        if(head == nMinOnethNode && n <= index)
        {
            return head.next;
        }else if(n < index) {
            nMinOnethNode.next = nMinOnethNode.next.next;
        }

        return  head;

    }


}
