//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BST<Integer> numTree = new BST<>();

        numTree.insertRecursively(5);
        numTree.insertRecursively(3);
        numTree.insertRecursively(9);
        numTree.insertRecursively(1);
        numTree.insertRecursively(4);
        numTree.insertRecursively(8);

        //numTree.printPreorder();

        System.out.println("More like toString");

        // System.out.println(numTree.preorder());

        System.out.println(numTree.postorder());
//        numTree.insert(5);
//        numTree.insert(1);
//        numTree.insert(3);
//        numTree.insert(9);
//        numTree.insert(8);
//        numTree.insert(4);



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

    public void insertRecursively(T item) {
        if (root == null) {
            root = new Node(item);
        } else {
            insertRecursively(item, root);
        }

    }

    private void insertRecursively(T item, Node subRoot) {
        if (item.compareTo(subRoot.data) < 0) {
            // go left
            if (subRoot.left == null) {
                Node node = new Node();
                node.data = item;
                subRoot.left = node;
            } else {
                insertRecursively(item, subRoot.left);
            }
        } else {
            // go right
            if (subRoot.right == null) {
                Node node = new Node();
                node.data = item;
                subRoot.right = node;
            } else {
                insertRecursively(item, subRoot.right);
            }
        }
    }


    public void insert(T item) {
        /*
        check if the item i'm trying insert is
        < or > than... the node
         */
        Node node = new Node();
        node.data = item;

        if (root == null) {
            // empty tree
            root = node;
            return;
        }
        Node itr = root;
        while(true) {

            if (item.compareTo(itr.data) < 0) {
                // itr.data < root.data
                // go left
                if (itr.left == null) {
                    // I've fallen
                    itr.left = node;
                    return;
                } else {
                    itr = itr.left;
                }

            } else {
                if (itr.right == null) {
                    // I've fallen
                    itr.right = node;
                    return;
                } else {
                    itr = itr.right;
                }
            }
        }
    }

    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(Node subRoot) {
        /*
        Recursive do the following algorithm:
        print out the contents of the node
        recursively go to the left subtree
        recursively go to the right subtree
         */
        if (subRoot == null) {
            return;
        }
        // V L R
        System.out.println(subRoot.data + " ");
        printPreorder(subRoot.left);
        printPreorder(subRoot.right);
    }

    public String preorder() {
        System.out.println("Preorder toString...");
        StringBuilder output = new StringBuilder();

        preorder(root, output);

        return output.toString();
    }

    private void preorder(Node subRoot, StringBuilder output) {
        if (subRoot == null) {
            return;
        }
        // V L R
        output.append(subRoot.data + " ");
        preorder(subRoot.left, output);
        preorder(subRoot.right, output);
    }

    public String postorder() {
        //System.out.println("Preorder toString...");
        StringBuilder output = new StringBuilder();

        postorder(root, output);

        return output.toString();
    }

    private void postorder(Node subRoot, StringBuilder output) {
        if (subRoot == null) {
            return;
        }
        // L R V
        postorder(subRoot.left, output);
        postorder(subRoot.right, output);
        output.append(subRoot.data + " ");
    }

    class Node {
        T data;
        Node left, right;

        public Node() {

        }
        public Node(T data) {
            this.data = data;
        }
    }
}
