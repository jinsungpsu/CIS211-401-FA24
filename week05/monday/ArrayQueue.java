public class ArrayQueue<T> {
    private int back;
    private int count;
    private T[] queueContents;

    // If we choose the front of the queue to be index 0
    // we need to change
    // dequeue to shift items over, so 0 is consistently the "front" item
    public void enqueue(T item) {
        queueContents[back++] = item;
        count++;
    }

    public T dequeue() {
        count--;
        return queueContents[0];
    }
}
