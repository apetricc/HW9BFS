/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 45 points: Define a class named Graph to represent a graph, in a fashion
 * conducive to breadth-first searching. Private Data fields will be: "n", an
 * int for the number of vertices in the graph. "edges", a 2D boolean array of
 * size n-by-n, to store an adjacency matrix. "vertices", a length-n array of
 * Vertex, to store information about each vertex. "queue", a LinkedList<Vertex>
 * to be used only for queue operations. (The LinkedList class conveniently
 * implements the Queue Java Interface.) You'll want to make a public getter
 * method for n. You'll also want a public getter method for a Vertex, with a
 * parameter index i indicating the Vertex label to return. e.g. getVertex(3)
 * would return the Vertex handle whose label is 3. The constructor will take a
 * 2D boolean square array (that means the same length in both dimensions), as a
 * parameter. You may assume the matrix is square. The constructor should
 * construct an empty LinkedList for your queue, initialize the n data field,
 * copy the entire parameter 2D array into a brand new copy for your edges data
 * field, and init and construct your array of vertices with labels 0 through
 * n-1. Define a printGraph class method to print n, and then a nicely formatted
 * table of the adjacency matrix. Define a breadthFirstSearch class method, to
 * perform a breadth-first search. The only parameter sourceLabel is a number
 * between 0 and n-1, the label of the source vertex. You will want to create a
 * local Vertex handle s, set to element sourceLabel of your Vertex array, right
 * away. You will also want to use the Queue Java interface methods offer
 * (that's your ENQUEUE), poll (that's your DEQUEUE), and peek, on your queue.
 */
public class Graph {

    private int n;
    private boolean[][] edges;
    private Vertex[] vertices;
    private Queue<Vertex> queue;

    public Graph(boolean[][] edges) {
        this.n = edges.length;
        queue = new LinkedList<>();
        this.edges = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.edges[i][j] = edges[i][j];
            }
        }
        vertices = new Vertex[n];
        for (int i = 0; i < n; i++) {
            vertices[i] = new Vertex(i);
        }
        //this.vertices = Arrays.copyOf(vertices, n);
        //this.edges = Arrays.copyOf(edges, n);

    }//Graph constructor

    public int getN() {
        return n;
    }

    public Vertex getVertex(int i) {
        return vertices[i];
    }

    public void printGraph() {
        System.out.println("The graph has " + n + " vertices.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(edges[i][j]);
            }
        }
    }

    /*
     /*
     Define a breadthFirstSearch class method, to perform a breadth-first
     * search. The only parameter sourceLabel is a number between 0 and n-1,
     * the label of the source vertex. You will want to create a local Vertex
     * handle s, set to element sourceLabel of your Vertex array, right away.
     * You will also want to use the Queue Java interface methods offer (that's your
     * ENQUEUE), poll (that's your DEQUEUE), and peek, on your queue.
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
    public void breadthFirstSearch(int sourceLabel) throws Exception {
        Vertex s = new Vertex(sourceLabel);
        //for (type variable: Collection)
        //for (Vertex u: G.getVertex(sourceLabel))
        for (int i = 0; i < getN(); i++) {
            getVertex(i).setColor(Vertex.WHITE);
            getVertex(i).setDistance(Vertex.INFINITY);
            getVertex(i).setParent(null);
        }
        s.setColor(Vertex.GRAY);
        s.setDistance(0);
        s.setParent(null);
        Queue<Vertex> Q = new LinkedList<Vertex>();
        Q.offer(s);

        while (Q.size() != 0) {
            Vertex u = queue.poll();//Q.remove();
            u.setColor(Vertex.BLACK);
            for (int i = 0; i < getN(); i++) {
                if (getVertex(i + 1).getColor() == Vertex.WHITE) {
                    getVertex(i + 1).setColor(Vertex.GRAY);
                    getVertex(i + 1).setDistance(getVertex(i).getDistance() + 1);
                    getVertex(i + 1).setParent(getVertex(i));
                    Q.add(getVertex(i + 1));
                }
            }
        }

    }

}
