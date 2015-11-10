/*
 * Header comment goes here.
 */


public class HW9BFS {

    /*
    15 points: In main, test your Graph class and perform breadth­first search. 
○ Manually initialize at least three boolean 2D arrays of the adjacency 
matrices of a few different graphs, each fully connected with at least 5 
vertices. You may want to draw them on paper first, then write down the 
adjacency matrices. 
○ With each matrix, construct a Graph object, and perform a breadth­first 
search. Afterward, you'll want to printGraph and also print out all the 
vertices.  (By reading all the parent labels in the Vertex print statements, 
you could draw the breadth­first tree on paper to make sure it's working 
correctly.) 
    
    */
    
    public static void main(String[] args) throws Exception {
        /*
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int item : arr) {
            System.out.println("The loop worked to print out the item which is the number:  " + item + " ");
        }
        */
        
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
                {true, false, false, false, false, false},
                {true, false, false, false, true, false},
                {false, false, true, true, false, true},
                {false, false, false, false, true, false},
        };

        Graph Graph2 = new Graph(myArray2);

        boolean [][] myArray3 = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };

        Graph Graph3 = new Graph(myArray2);



        //actual testing part
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
