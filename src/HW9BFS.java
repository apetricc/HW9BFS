/**
 * Andrew Petriccione
 * Csci 333 Fall 2015
 * Professor Whitley
 * Homework 9: Breadth First Search
 * The point of this assignment is to implement Graph class
 * that we can perform a breadth first search on.
 */
//package hw9bfs;

/**
 * the HW9BFS class contains the main method to run tests on the Graph class
 */
public class HW9BFS {
    /**
     * main runs tests on the graph class
     */
    
    public static void main(String[] args) throws Exception {
        
        boolean [][] myArray1 = {
        {false, true, false, false, false},
        {false, false, true, false, true},
        {false, true, false, true, true},
        {false, false, true, false, false},
        {false, true, true, false, false}
        };
        
        Graph Graph1 = new Graph(myArray1);

        boolean [][] myArray2 = {
                {false, true, true, true, false, false},
                {true, false, false, false, true, false},
                {true, false, false, false, false, true},
                {true, false, false, false, false, true},
                {false, true, false, false, false, true},
                {false, true, true, true, false, false}
        };

        Graph Graph2 = new Graph(myArray2);
        
        boolean [][] myArray3 = {
                {false, true, false, false, false, false, false, false},
                {true, false, true, true, false, false, false, false},
                {false, true, false, true, true, false, true, false},
                {false, true, true, false, true, false, false, false},
                {false, false, true, true, false, true, false, false},
                {false, false, false, false, true, false, true, true},
                {false, false, true, false, false, true, false, false},
                {false, false, false, false, false, true, false, false},
        };

        Graph Graph3 = new Graph(myArray3);

        System.out.println("Here are the vertices of Graph1 before the search. ");
        Graph1.printVertices();
        System.out.println("\nHere's the adjacency matrix of Graph1: ");
        Graph1.printGraph();
        Graph1.breadthFirstSearch(0);
        System.out.println("\nHere are the vertices of Graph1 after the breadth first search: ");
        Graph1.printVertices();

        System.out.println("\nHere are the vertices of Graph2 before the search. ");
        Graph2.printVertices();
        System.out.println("\nHere's the adjacency matrix of Graph2: ");
        Graph2.printGraph();
        Graph2.breadthFirstSearch(0);
        System.out.println("\nHere are the vertices of Graph2 after the breadth first search: ");
        Graph2.printVertices();        
        
        System.out.println("\nHere are the vertices of Graph3 before the search. ");
        Graph3.printVertices();
        System.out.println("\nHere's the adjacency matrix of Graph3: ");
        Graph3.printGraph();
        Graph3.breadthFirstSearch(0);
        System.out.println("\nHere are the vertices of Graph3 after the breadth first search: ");
        Graph3.printVertices();

    }

}
