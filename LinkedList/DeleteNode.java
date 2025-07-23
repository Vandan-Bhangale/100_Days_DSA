package LinkedList;

public class DeleteNode {

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

    private void deleteNode(Node delNode) {
        if(delNode == null || delNode.next == null) {
            return;
        }

        Node temp = delNode.next;
        delNode.data = temp.data;

        delNode.next = temp.next;
    }

    public void deleteNode(String data) {
        Node curr = head;
         while (curr != null && curr.data != null && !curr.data.equals(data)) {
            curr = curr.next;
        }

        if(curr != null) {
            deleteNode(curr);
        }
    }

    public void printLL() {
        Node curr = head;

        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        DeleteNode DL = new DeleteNode();

        DL.addFirst("1");
        DL.addFirst("2");
        DL.addFirst("3");
        DL.addFirst("4");
        DL.addFirst("5");

        DL.deleteNode("4");

        DL.printLL();
    }
}
