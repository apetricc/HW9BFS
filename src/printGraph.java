package hw9bfs;

/**
 * Created by petriccione on 11/5/15.
 */
/*
  Define a PrintGraph class method to print n,
  and then a nicely formatted table of the adjacency matrix.
 */

public class PrintGraph {
    public void printGraph(Graph G) {
        System.out.println("The graph has " + G.getN() + " vertices.");
        
        
        for (int i = 0; i < G.getN(); i++) {
            for (int j = 0; j < theGraph.getN(); j++) {
                System.out.println(theGraph.vertices[i][j]);
                System.out.println(theGraph.edges[i][j]);
            }
        }
    }

}
