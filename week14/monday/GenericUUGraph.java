import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class GenericUUGraph<T> {

    private final int DEFAULT_CAPACITY = 5;
    private boolean[][] adjMatrix;
    private T[] nodes;
    private int count = 0;

    HashMap<T, Integer> airportHash = new HashMap<>();

    public GenericUUGraph() {
        adjMatrix = new boolean[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
        nodes = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public GenericUUGraph(int numNodes) {
        adjMatrix = new boolean[numNodes][numNodes];
        nodes = (T[]) (new Object[numNodes]);
    }

    public boolean hasEdge(T src, T dest) {
        int srcIndex = airportHash.get(src);
        int destIndex = airportHash.get(dest);

        return adjMatrix[srcIndex][destIndex];
    }

    public T[] neighbors(T node) {
        /*
        just see what edges are there
        use the srcIndex

        iterate through that row (or column)
        use a for loop
         */
        int srcIndex = airportHash.get(node);

        ArrayList<T> neighbors = new ArrayList<>();
        //ArrayList<Integer> neighborIndices = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (adjMatrix[srcIndex][i]) {
                // add this i to a list of indices I'm keeping track of
                neighbors.add(nodes[i]);
            }
        }

//        for(Map.Entry<T, Integer> entry : airportHash.entrySet()) {
//            T key = entry.getKey();
//            Integer value = entry.getValue();
//
//
//        }

        return (T[]) (neighbors.toArray());

    }

    public boolean neighborWithinTwoEdges(T src, T dest) {
        if (hasEdge(src, dest)) {
            return true;
        }

        T[] directNeighbors = neighbors(src);

        for (int i = 0; i < directNeighbors.length; i++) {
            if (hasEdge(directNeighbors[i], dest)) {
                return true;
            }
        }
        return false;
    }

    public void addNode(T item) {
        /*
        the first item i add becomes the first row/col
        of the adj matrix...

        version 1.0

        keep a counter...
         */
        nodes[count] = item;
//        count++;

        /*
        version 2.0
         */
        airportHash.put(item, count++);

    }

    public void addEdge(T src, T dest) {
        /*
        what is src, dest?
         */
        int srcIndex = -1; // when src = "PHL", srcIndex = 0
        int destIndex = -1; // when dest = "JFK", destIndex = 2

//        for (int i = 0; i < count; i++) {
//            if (nodes[i].equals(src)) {
//                srcIndex = i;
//            }
//            if (nodes[i].equals(dest)) {
//                destIndex = i;
//            }
//        }

        srcIndex = airportHash.get(src);
        destIndex = airportHash.get(dest);

        if (srcIndex == -1 || destIndex == -1) {
            throw new NoSuchElementException("Airport doesn't exist");
        }
        adjMatrix[srcIndex][destIndex] = true;
        adjMatrix[destIndex][srcIndex] = true;
    }
}

class Airport {
    private String code;
    private String name;
    private String city;

    public Airport(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object other) {
        if (this.code.equals(((Airport)other).code)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return code;
    }
}
