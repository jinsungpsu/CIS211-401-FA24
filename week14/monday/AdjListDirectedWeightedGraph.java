import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

class AdjListTester {
    public static void main(String[] args) {
        AdjListDirectedWeightedGraph<String> airports = new AdjListDirectedWeightedGraph<>();

        airports.addNode("EWR");
        airports.addNode("JFK");
        airports.addEdge("EWR", "JFK", 50);

        System.out.println("EWR and JFK are connected? " + airports.hasEdge("EWR", "JFK"));
        System.out.println("JFK and EWR are connected? " + airports.hasEdge("JFK", "EWR"));

    }
}

public class AdjListDirectedWeightedGraph<T> {
    /*
    similar to hash table
    array of linked lists

    each "row" corresponds to a node
    each entry in that row...
      2 pieces of info:
        1) what node does it connect to
        2) what is the weight of that connection
     */

    // very similar to hash table implementation
    //LinkedList<Entry> adjList = new LinkedList<Entry>();

    Hashtable<T, LinkedList<Entry>> adjList = new Hashtable<>();

    public void addNode(T node) {
        adjList.put(node, new LinkedList<>());
    }

    public void addEdge(T src, T dest, int weight) {
        adjList.get(src).add(new Entry(dest, weight));
    }

    public boolean hasEdge(T src, T dest) {
        Iterator<Entry> itr = adjList.get(src).iterator();

        while(itr.hasNext()) {
            Entry entry = itr.next();
            if (entry.dest.equals(dest)) {
                return true;
            }
        }
        return false;
    }

    private class Entry {
        T dest;
        int weight;

        public Entry(T dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }
}
