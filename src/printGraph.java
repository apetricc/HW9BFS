/**
 * Created by petriccione on 11/5/15.
 */
/*
  Define a printGraph class method to print n,
  and then a nicely formatted table of the adjacency matrix.
 */
public class printGraph {
    public void printGraph(Graph theGraph) {
        System.out.println("The graph has " + theGraph.getN() + " vertices.");
        for (int i = 0; i < theGraph.getN(); i++) {
            for (int j = 0; j < theGraph.getN(); j++) {
                System.out.println(theGraph.vertices[i][j]);
                System.out.println(theGraph.edges[i][j]);
            }
        }
    }

}
