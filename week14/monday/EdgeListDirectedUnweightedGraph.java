import java.util.Iterator;
import java.util.LinkedList;

class Tester {
    public static void main(String[] args) {
        EdgeListDirectedUnweightedGraph<String> airports = new EdgeListDirectedUnweightedGraph();
        airports.addEdge("EWR", "JFK");

        System.out.println("EWR and JFK are connected? " + airports.hasEdge("EWR", "JFK"));
        System.out.println("JFK and EWR are connected? " + airports.hasEdge("JFK", "EWR"));

    }
}

public class EdgeListDirectedUnweightedGraph<T> {
    /*
    there's a list
    each entry in the list contains
        src, dest, weight
     */
    LinkedList<Edge> edgeList = new LinkedList<>();


    // add node doesn't make a whole lot of sense here
    // this implementation is very "edge" centric

    public void addEdge(T src, T dest) {
        edgeList.add(new Edge(src, dest));
    }

    public boolean hasEdge(T src, T dest) {
        Iterator<Edge> itr = edgeList.iterator();

        while (itr.hasNext()) {
            Edge edge = itr.next();
            if (edge.dest.equals(dest) && edge.src.equals(src)) {
                return true;
            }
        }
        return false;
    }


    private class Edge {
        T src, dest;

        public Edge(T src, T dest) {
            this.src = src;
            this.dest = dest;
        }
    }
}
