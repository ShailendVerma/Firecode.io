package shail.linkedlist;

public class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }

        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }