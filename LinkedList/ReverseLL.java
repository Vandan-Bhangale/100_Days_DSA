package LinkedList;

public class ReverseLL {
     Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        if(head == null) {
            System.out.println("Linked list in empty.");
            return;
        }

        Node curNode = head;

        while(curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }

        System.out.println("NULL");
    }

    public Node reverseLL() {
        if(head == null || head.next == null) {
            return head;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null) {
            Node nextNode = currNode.next;     //Storing the next node value first
            currNode.next = prevNode;     //Reversing currNode

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        return prevNode;
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        ReverseLL LinkedList = new ReverseLL();

        LinkedList.addFirst("5");
        LinkedList.addFirst("4");
        LinkedList.addFirst("3");
        LinkedList.addFirst("2");
        LinkedList.addFirst("1");

        System.out.print("Original LinkedList: ");
        LinkedList.printLL();

       Node reversedList =  LinkedList.reverseLL();
       System.out.print("Reversed LinkedList: ");
        LinkedList.printList(reversedList);
    }
}
