import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by petriccione on 11/5/15.
 */
/*
BFS(G, s) // G is the graph, s is the source vertex in G
    for (each vertex u in G except for s)
       u.color = WHITE
       u.d = ∞ // infinite distance, for now. replaced later with a real distance
       u.p = NULL
    s.color = GRAY
    s.d = 0 // s is distance 0 from itself
    s.p = NULL // s is the root of the breadth-first tree
    let Q be a new and empty queue
    ENQUEUE(Q, s) // put vertex s into the queue: the first vertex to be visited


    while (Q is not empty)
       u = DEQUEUE(Q) // remove a vertex u to visit, from Q
       u.color = BLACK
       for (each vertex v adjacent to u)
          if v.color == WHITE // gray or black neighbors are left alone
             v.color = GRAY
             v.d = u.d + 1 // v (the child of u) is 1 farther from s than u
             v.p = u // v is added to the breadth-first tree as a child of u
             ENQUEUE(Q, v) // put v in the queue of vertices to visit later

 */
public class breadthFirstSearch {
    public breadthFirstSearch(Graph G, Vertex s) throws Exception{
        for (int i = 0; i < G.getN(); i++) {
            G.getVertex(i).setColor(Vertex.WHITE);
            G.getVertex(i).setDistance(Vertex.INFINITY);
            G.getVertex(i).setParent(null);
        }
        s.setColor(Vertex.GRAY);
        s.setDistance(0);
        s.setParent(null);
        Queue<Vertex> Q = new LinkedList<Vertex>();
        Q.add(s);

        while(Q.size() != 0) {
            Vertex u = Q.getFirst();
        }


    }

}
