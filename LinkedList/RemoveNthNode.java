package LinkedList;

public class RemoveNthNode {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        // Move secondPtr n steps ahead
        for (int i = 0; i < n; i++) {
            secondPtr = secondPtr.next;
        }

        // Move both pointers until secondPtr reaches the end
        while (secondPtr.next != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        // Remove the nth node from end
        firstPtr.next = firstPtr.next.next;

        return dummy.next;
    }

    // Utility method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        printList(head);

        int n = 2;
        head = removeNthFromEnd(head, n);

        System.out.print("After removing " + n + "th node from end: ");
        printList(head);
    }
}

