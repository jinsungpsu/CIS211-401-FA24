public class GenericUUGraph<T> {

    private final int DEFAULT_CAPACITY = 5;
    private boolean[][] adjMatrix;
    private T[] nodes;

    public GenericUUGraph() {
        adjMatrix = new boolean[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
        nodes = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public GenericUUGraph(int numNodes) {
        adjMatrix = new boolean[numNodes][numNodes];
        nodes = (T[]) (new Object[numNodes]);
    }

    public void addNode(T item) {
        /*
        the first item i add becomes the first row/col
        of the adj matrix...

        keep a counter...
         */
    }
}
