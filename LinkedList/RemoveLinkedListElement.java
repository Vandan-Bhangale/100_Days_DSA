package LinkedList;

public class RemoveLinkedListElement {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node removeElement(Node head,int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }

        Node curr = head;

        while(curr != null && curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        if(head == null) {
            return;
        }

        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(5);
        int val = 6;

        System.out.print("Original Linked List: ");
        printList(head);
        System.out.println();
        removeElement(head,val);
        System.out.print("Linked List after removing value node: ");
        printList(head);
    }
        
}
