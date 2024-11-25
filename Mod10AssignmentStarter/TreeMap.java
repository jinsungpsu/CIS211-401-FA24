public class TreeMap<K extends Comparable<K>, V> implements Map<K, V> {
    private Node root;

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (root == null) {
            root = new Node(key, value);
        } else {
            insertRecursively(key, value, root);
        }
        return null;
    }
    
    private void insertRecursively(K key, V value, Node itr) {
        
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    class Node {
        Node left, right;
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

class Pokemon implements Comparable<Pokemon> {
    int attack;
    String name;

    public Pokemon(String name, int attack) {
        this.attack = attack;
    }

    public int compareTo(Pokemon other) {
        if (this.attack < other.attack) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pikachu", 500);
        Pokemon p2 = new Pokemon("Charizard", 600);
        Pokemon p3 = new Pokemon("Squirtle", 400);
        Pokemon p4 = new Pokemon("Butterfree", 200);

        Map<String, Pokemon> pokedex = new TreeMap<>();
        pokedex.put("Pikachu", p1);
        pokedex.put("Charizard", p2);
        pokedex.put("Squirtle", p3);
        pokedex.put("Butterfree", p4);


        // Since the pokemon were added according to their name (String)
        // the BST will be ordered in this way
        //                    Pikachu (root)
        //                   /       \
        //             Charizard      Squirtle
        //                /
        //           Butterfree

        // this should assign the Butterfree Pokemon object to ref var p5
        // and also display the value 3, because it took 3 comparisons to retrieve
        // the object
        Pokemon p5 = pokedex.get("Butterfree");

        // this should assign the Pikachu Pokemon object to ref var p6
        // and also display the value 1, because it took 1 comparison to retrieve
        // the object (which was found at the root)
        Pokemon p6 = pokedex.get("Pikachu");

    }
}
