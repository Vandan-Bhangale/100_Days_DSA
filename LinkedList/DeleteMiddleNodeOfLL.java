package LinkedList;

public class DeleteMiddleNodeOfLL {
    public ListNode deleteMiddle(ListNode head) {
        ListNode currNode = head;

        if(head == null || head.next == null) {
            return null;
        }

        int length = 0;

        while(currNode != null) {
            length++;
            currNode = currNode.next;
        }

        int middleIndex = length/2;

        ListNode prev = null;
        ListNode middleNode = head;

        for(int i = 0;i<middleIndex;i++) {
            prev = middleNode;
            middleNode = middleNode.next;
        }

        prev.next = prev.next.next;
        return head;
    }
}
