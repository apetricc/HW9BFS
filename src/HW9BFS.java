/*
 * Header comment goes here.
 */
package hw9bfs;

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
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i : arr) {
            System.out.println("The loop worked to print out the item which is the number:  " + i + " ");
        }
        
        boolean [][] myArray = new boolean[][] {
        {false, true, false, false, false},
        {false, false, true, false, true},
        {false, true, false, true, true},
        {false, false, true, false, false},
        {false, true, true, false, false}
        };
        
        Graph myGraph = new Graph(myArray);
        
        
        myGraph.getN();
        
        
        
        
    }

}
