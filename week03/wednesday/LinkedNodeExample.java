public class Node<T> {
    public T stuff;
    public Node next;
}

class LinkedNodeExample {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>();
        Node<Integer> n2 = new Node<>();
        Node<Integer> n3 = new Node<>();
        n1.stuff = 2;
        n2.stuff = 3;
        n3.stuff = 99;

        n1.next = n2;
        n2.next = n3;

        // print out the value of the third node... (99)
        System.out.println(n3.stuff);
        System.out.println(n2.next.stuff);
        System.out.println(n1.next.next.stuff);
    }
}
