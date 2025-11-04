package LinkedList;

public class RemoveDuplicate {

    static class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

static Node removeDuplicates(Node head) {
    Node curr1 = head;
    while(curr1 != null) {
        Node curr2 = curr1;

        while(curr2.next != null) {
            if(curr2.next.val == curr1.val) {
                curr2.next = curr2.next.next;
            } else {
                curr2 = curr2.next;
            }
        }
         curr1 = curr1.next;
    }
    return head;
}

static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ->" + " ");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        printList(head);
        head = removeDuplicates(head);
        printList(head);
    }   
}
