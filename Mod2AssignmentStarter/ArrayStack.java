import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T>{
    private final int DEFAULT_CAPACITY = 10;
    private T[] stack;

    private int count = 0;

    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int initialSize) {
        stack = (T[]) new Object[initialSize];
    }

    @Override
    public void push(T item) throws IllegalStateException {
        if (count >= stack.length) {
            throw new IllegalStateException();
        }
        count++;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {


        // this doesn't work when stack is empty
        // will go to index -1

        // need to add a special case when it's empty
        // or when count = 0
        if (count == 0) {
            return null;
        }
        return stack[count-1];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }
}
