//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        BST<Pokemon> pokeTree = new BST<>();
    }
}

class Pokemon implements Comparable<Pokemon> {
    private String name;
    private int attack;

    @Override
    public int compareTo(Pokemon other) {
        if (this.attack < other.attack) {
            return -1;
        } else if (this.attack > other.attack) {
            return 99;
        }
        return 0;
    }
}

class BST<T extends Comparable<T>> {
    private Node root;

    public void insert(T item) {
        /*
        check if the item i'm trying insert is
        < or > than... the node
         */
        Node itr = root;
        if (itr.data.compareTo(root.data) < 0) {
            // itr.data < root.data
            // go left
            itr = itr.left;
        }
    }

    class Node {
        T data;
        Node left, right;
    }
}
