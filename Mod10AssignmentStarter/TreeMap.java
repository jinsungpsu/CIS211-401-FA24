public class TreeMap<K extends Comparable<K>, V> implements Map<K, V> {
    private Node root;

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
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
    }
}

class Pokemon implements Comparable<Pokemon> {
    int attack;

    public Pokemon(int attack) {
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
        Pokemon p1 = new Pokemon(500);
        Pokemon p2 = new Pokemon(600);

        Map<String, Pokemon> pokedex = new TreeMap<>();
        pokedex.put("Pikachu", p1);
        pokedex.put("Charizard", p2);
    }
}
