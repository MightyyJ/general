/**
 * @author MightyJoe
 * purpose: Refresher on datastructures part 1. Here we are 
 * working with BST. We implement the common operations insert,
 * search/find, delete from the trees. In addtion we implement 
 * the various tree traversals. 
 */
public class BinarySearchTree {
    Node root;

    /**
     * 
     */
    BinarySearchTree(){
        root = null;
    }

    /**
     * 
     * @param head
     * @param datum
     * @return
     */
    public Node insertNode(Node root, int datum){

        // if the root being passed in is nullptr
        // then return a new Node so that the parent node
        // now points to the new node
        if (root == null){
            root = new Node(datum);
        }
        else{
            // if our data is less than what we are inserting
            // then traverse rightwards
            if (root.data < datum)
                root.right = insertNode(root.right, datum);
            // Else our data was greater than the inserting node
            // traverse leftwards    
            else
                root.left = insertNode(root.left, datum);
        }
        // recurse upwards and return the reference to the root node. 
        return root;
    }

    public Node findMinValue(Node node){

        Node minNode;

        // if we have no more nodes on the left.
        // We have our min node 
        if (node.left == null)
            return node;
        else
            // recurse down the left hand side of the tree
            minNode = findMinValue(node.left);
        
        return minNode;
    }

    /**
     * 
     * @param root
     * @param datum
     * @return
     */
    public Node deleteNode(Node node, int datum){

        Node holder;

        // we recursed down to the base case
        if (node == null)
            return node;
        // node was not null
        else {
            
            // if node data is less than the datum to delete
            // keep recursing down the right side of tree
            if(node.data < datum)
                node.right = deleteNode(node.right, datum);
            // If node data is greater than the data to delete
            // recurse down the right side of the three
            else if (node.data > datum)
                node.left = deleteNode(node.left, datum);
            // else we are at the node to remove                
            else {
                // One of the nodes children are null
                 if (node.left == null || node.right == null){
                     // hold the right side since left is null
                    if(node.left == null)
                        holder = node.right;
                    // hold the left side since right is null
                    else
                        holder = node.left;
                    // set the node to null ptr
                    node = null;
                    // return the holder node
                    return holder;
                    
                }
                // we have children on both ends
                else {
                    // get the min node of the right sub tree
                    holder = findMinValue(node.right);
                    // copies the contents of the min value 
                    node.data = holder.data;
                    // delete the copied node (the min value that we just obtained)
                    // we just copied it now we need to remove it.
                    node.right = deleteNode(node.right, holder.data);
                }
                    
            }
        }

        return node;
    }

    /**
     * 
     * @param head
     * @param datum
     * @return
     */
    public boolean findNode(Node node, int datum){

        if (node == null)
            return false;
        else if (node.data == datum)
            return true;
        else {
            // if the current nodes data is less than
            // the one we are search for then move left
            if(node.data < datum)
                return findNode(node.right, datum);
            // if the current nodes data is greater than the 
            // one we are searching for then move left
            else if (node.data > datum)
                return findNode(node.left, datum);
        }
        // node was not null
        // nodes data was not stricly greater or less than
        // so we must have been equal to.
       return true;
    }

    /**
     * 
     * @param head
     */
    public void inOrderTraverseal(Node head){
        
        if (head == null){
            return;
        }
        else{
            inOrderTraverseal(head.left);
            System.out.print(String.valueOf(head.data) + " ");
            inOrderTraverseal(head.right);
        }
    }

    /**
     * 
     * @param head
     */
    public void preOrderTraversal(Node head){

        if (head == null){
            return;
        }
        else{
            System.out.print(String.valueOf(head.data) + " ");
            preOrderTraversal(head.left);
            preOrderTraversal(head.right);
        }
    }

    /**
     * 
     * @param head
     */
    public void postOrderTraversal(Node head){

        if (head == null){
            return;
        }
        else{
            postOrderTraversal(head.left);
            postOrderTraversal(head.right);
            System.out.print(String.valueOf(head.data) + " ");
        }
    }
}
