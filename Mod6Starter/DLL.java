public class DLL {
    private Node head, tail;
    /*
    head = front of the deque
    tail = back of the deque
     */

    public void addFront(int item) {
        /*
        create a new node
        make that node's next = the current head
        make that node's prev = null
        make the old head's prev = this new node
        update the value of head to this new node

        do something about the tail refer...
         */
        Node node = new Node();
        node.data = item;
        node.prev = null; // redundant
        node.next = head;
        if (head != null) {
            // head exists already!
            head.prev = node;
        } else {
            // head does not exist yet
            // this is the very first item ever inserted
            // head and tail are one and the same
            tail = node;
        }
        head = node;

    }

    class Node {
        int data;
        Node next, prev;
    }
}
