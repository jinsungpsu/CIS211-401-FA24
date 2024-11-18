public class UndirectedUnweightedGraph {
    /*
    adj matrix...
    2D array
    EVERY node has its own row/column

    most examples on the internet
    will be a 2D array of integers or boolean
    where...
    the index itself represents the data
     */

    private final int DEFAULT_CAPACITY = 5;
    /*
    this graph has preallocated memory
    for 5 nodes...
    the data in each of these 5 nodes is
    0, 1, 2, 3,4
     */

    public boolean[][] adjMatrix;

    public UndirectedUnweightedGraph() {
        adjMatrix = new boolean[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
    }

    public UndirectedUnweightedGraph(int numNodes) {
        adjMatrix = new boolean[numNodes][numNodes];
    }

    public void addEdge(int src, int dest) {

    }



}
