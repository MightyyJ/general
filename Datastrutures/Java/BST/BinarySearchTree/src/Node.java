public class Node {
    
    // Data contained in each node
    int data;
    // reference to left node
    Node left;
    // reference to right node
    Node right; 

    // Node constructor 
    Node(int datum){
        data = datum;
        left = null;
        right = null;
    }
}
