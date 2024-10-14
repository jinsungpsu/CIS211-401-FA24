import java.util.LinkedList;

public class HashTable<K, V> {
    /*
    closed hashing
     */
    private K[] keys;
    private V[] values;
    private int count = 0;

    private final int DEFAULT_CAPACITY = 10;

    public HashTable() {
        keys = (K[]) new Object[DEFAULT_CAPACITY];
        values = (V[]) new Object[DEFAULT_CAPACITY];
    }

    public HashTable(int size) {
        keys = (K[]) new Object[size];
        values = (V[]) new Object[size];
    }


    /*
    open hashing
     */
    LinkedList<Entry>[] table;
    class Entry {
        K key;
        V value;
    }

    /*
    hash function
    1. must return same value on same object
    2. if two objects are "equal" return same value
    3. not guaranteed that two different objects get two different values
     */

    private int hash(K key) {
        // worst hash function of all time
        // return 0;

        // let's improve this a bit...
        // base it on toString method
        String something = key.toString();
        // return something.length();

        // return something.charAt(0) % keys.length;

        // return something.charAt(0) * 11 % keys.length;
        return something.charAt(0) * 11 + something.charAt(1) * something.length() % keys.length;
    }

    public void put(K key, V value) {
        /*
        algorithm for this?
        for closed hashing?

        figure out hash value of the key
        ===> the spot in the array where we want to put the item

        collision???
        -- look for an empty spot
        ---- check if that spot is taken
        ---- move to the next one...
        ------- if that one's taken, though...
        ---------- move to the next one
        ---------- probably a loop
         */

        if (count >= keys.length) {
            // throw error
            // array/table is full
            return;
        }

        int index = hash(key);

        if (keys[index] != null) {
            // if that spot is taken
            for (int i = index+1; i < keys.length; i++) {
                // is the next spot open?
                if (keys[i] == null) {
                    index = i;
                    break;
                }
            }
        }

        keys[index] = key;
        values[index] = value;
    }
}

class Tester {
    public static void main(String[] args) {
        HashTable<String, String> dictionary = new HashTable<>();
        dictionary.put("Hello", "Hola");
        dictionary.put("Bye", "Adios");
        dictionary.put("One", "Uno");
        dictionary.put("Two", "Dos");
    }
}
