import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] queue;
    private int count = 0;
    private int back, front;

    public ArrayQueue() {
        queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue(int initialCapacity) {
        queue = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void enqueue(T it) throws IllegalStateException {
        // if (top == arr.length) <-- this meant the arr was full back in array stack
        if (count >= queue.length) {
            throw new IllegalStateException("Array/Queue is full.");
        } else {
            /*
            I could fix the array out of bounds issue by using an if statement
            if (back == queue.length-1) back -= queue.length;
             */
            queue[back%queue.length] = it;
            back++;
            count++;
        }
    }

    @Override
    public T dequeue() {
        if (count == 0) {
            return null;
        }
        T returnData = queue[front%queue.length];
        front++;
        count--;
        return returnData;
    }

    @Override
    public T frontValue() {
        if (count == 0) return null;
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder output = new StringBuilder("[");
//        for (int i = 0; i < count; i++) {
//            // this loop is the correct # of iterations
//            // but the wrong spots in the array
//            output.append(queue[i] + " ");
//        }
//        for (int i = front; i < back; i++) {
//            output.append(queue[i] + " ");
//        }
       for (int i = 0; i < count; i++) {
           output.append(queue[(i+front)%queue.length]);
       }

        // for (int i = front% queue.length; i == (back-1)% queue.length; i++) {
        //     ****************************************************
        //     ****************************************************
        //     ***this one has an error and needs to be debugged***
        //     ****************************************************
        //     ****************************************************
        //     output.append(queue[i] + " ");
        // }

        return output.toString()+"]";
    }
}
