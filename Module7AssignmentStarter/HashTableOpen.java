import java.util.LinkedList;

public class HashTableOpen<K, V> {
    private final int DEFAULT_SIZE = 10;
    private LinkedList<Entry>[] table;
    // private ArrayList<LinkedList>

    private int count = 0;

    public HashTableOpen() {
        table = new LinkedList[DEFAULT_SIZE];
    }

    public HashTableOpen(int size) {
        table = new LinkedList[size];
    }

    public void put(K key, V value) {
        /*
        make an array? done

        something about a head of linked list...

        instead of iterating through array???
        calculate hash value

        do i need to iterate over the array???
        is there an empty spot or is there a linked list there???

        if there's an empty spot...
        --> no collision
        ----> make a linked list
        ----> populate it with a key and value

        if there's something already there (linked list),
        --> a collision occurred
        ----> "push" the key/value

        increment count
         */

        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        table[index].add(new Entry(key, value));
        count++;

//        if (table[index] == null) {
//            // nothing there... no collision
//            table[index] = new LinkedList<>();
//            table[index].add(new Entry(key, value));
//        } else {
//            // yes collision
//            table[index].add(new Entry(key, value));
//        }
//        count++;



    }

    private int hash(K key) {
        int hashValue = key.hashCode(); // the entire range of possible integers
        hashValue = Math.abs(hashValue);

        return hashValue % table.length;
    }

    private int fancyHash(K key) {
        int hashVal = 0;
        for (int i = 0; i < key.toString().length(); i++) {
            hashVal += key.toString().charAt(i);
        }
        return hashVal % table.length;
        /*
        What is the range of possible values that this could give?
        min = 1

        what is the max????
        largest ascii value of a given char multiplied by string length
        122 x (length of this string - urshifu single strike gigantamax)
         */
    }

    class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}


class Test {
    public static void main(String[] args) {
        HashTableOpen<String, String> dictionary = new HashTableOpen<>();

        dictionary.put("Hello", "Hola");
        dictionary.put("Bye", "Adios");
        dictionary.put("One", "Uno");
        dictionary.put("Two", "Dos");
    }
}
