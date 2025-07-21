package LinkedList;

public class LL {
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

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
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
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addFirst("is");
        linkedList.addFirst("a");
        linkedList.printLL();
    }
}
