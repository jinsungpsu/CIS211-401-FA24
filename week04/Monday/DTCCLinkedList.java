import java.util.LinkedList;
import java.util.List;



class DTCCLinkedList<T> {
    private Node head;
    private int size; // this COULD be useful???

    public boolean isEmpty() {
        /*
        if (head != null) {
            // this means that... the head is pointing to something
            // this list is filled with something
            // this list has at least one thing in it

        }
         */

        if (head == null) {
        // if (size == 0) {
            // it is empty???
            return true;
        }
        return false;
    }

    public void clear() {
        // iterate and delete
        // if I have a count... use a for loop
        // iterator... what is it?
        Node itr = head;
        for (int i = 0; i < size; i++) {
            itr.data = null;
            itr = itr.next;
            // "i++"
            // heads up.. .this will probably result in an error
            // you can debug on your own..
        }

        // if I don't have a count... while
        itr = head;
        while(itr.next != null) {
            // there's at least one node after this one
            itr = itr.next;
            // probably will still endup with an error...
        }

        // alternatively
        head = null;
    }

    public void add(T item) {
        // create a new node
        // and add the data to that node

        // connected it to the rest of the linked structure at the appropriate place...

        // assuming I'm adding at the tail
        // iterate to the end
        // connect a new node at the end

        Node itr = head;
        while (itr.next != null) {

        }
        // when I'm done going through this loop
        // I want itr to be at the tail
        itr.next = new Node(data);
    }

    // inner, nested, private class
    // now no longer need the class parameter
    private class Node {
        T data;
        Node next;
    }
}

class NodeDemo {
    public static void main(String[] args) {

        DTCCLinkedList<Integer> mylist = new DTCCLinkedList<>();


        List<String> postIts = new LinkedList<>();
        postIts.add("Study for MAT263");
        postIts.add("Buy milk");

        System.out.println(postIts);

        DTCCLinkedList<String> postIts2 = new DTCCLinkedList<>();
        postIts.add("Study for MAT263");
        postIts.add("Buy milk");

        System.out.println(postIts);
    }
}
