import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Queue<Integer> myQ = new ArrayQueue<>(3);
        myQ.enqueue(1);
        System.out.println(myQ.frontValue()); //1
        myQ.enqueue(2);
        System.out.println(myQ.frontValue()); //1
        myQ.enqueue(3);
        System.out.println(myQ.frontValue()); // 1
        System.out.println(myQ.dequeue()); // 1
        System.out.println(myQ.frontValue()); // 2
        System.out.println(myQ.dequeue()); // 2
        System.out.println(myQ.frontValue()); // 3

        System.out.println(myQ); // 1 2 3

        System.out.println(myQ.dequeue()); // 3

        System.out.println(myQ); // empty

        System.out.println(myQ.dequeue()); // null

        myQ.enqueue(4);
        System.out.println(myQ); // [4]

        System.out.println(myQ.dequeue()); // 4

        myQ.enqueue(5);
        System.out.println(myQ); // [5]











        ArrayList<Integer> l1 = new ArrayList<>();
        l1.addFirst(1);
        l1.ensureCapacity(5);

        List<Integer> l2 = new ArrayList<>();
        l2.addFirst(1);
        // l2.ensureCapacity(5) <--- this doesn't work
        // l2 in this program can only use the interface
        // provided for List...

    }
}
