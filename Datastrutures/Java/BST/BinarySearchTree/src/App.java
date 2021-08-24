public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("My BST program!");

        // Create a new BST object
        BinarySearchTree myTree = new BinarySearchTree();

        // Insert a bunch of Nodes
        myTree.root = myTree.insertNode(myTree.root, 15);
        myTree.root = myTree.insertNode(myTree.root, 25);
        myTree.root = myTree.insertNode(myTree.root, 1);
        myTree.root = myTree.insertNode(myTree.root, 6);
        myTree.root = myTree.insertNode(myTree.root, 77);
        myTree.root = myTree.insertNode(myTree.root, 55);
        myTree.root = myTree.insertNode(myTree.root, 12);
        myTree.root = myTree.insertNode(myTree.root, 21);
        myTree.root = myTree.insertNode(myTree.root, 33);
        myTree.root = myTree.insertNode(myTree.root, 13);
        myTree.root = myTree.insertNode(myTree.root, 66);
        myTree.root = myTree.insertNode(myTree.root, 57);
        myTree.root = myTree.insertNode(myTree.root, 51);
        myTree.root = myTree.insertNode(myTree.root, 22);
        myTree.root = myTree.insertNode(myTree.root, 29);

        // Do we have some nodes 
        boolean hasNode = myTree.findNode(myTree.root, 51);
        System.out.println(hasNode);

        hasNode = myTree.findNode(myTree.root, 3000);
        System.out.println(hasNode);

        // Print out the various tree traversals
        System.out.println("In order traversal:");
        myTree.inOrderTraverseal(myTree.root);

        System.out.println();
        System.out.println("PreOrder traversal: ");
        myTree.preOrderTraversal(myTree.root);

        System.out.println();
        System.out.println("PostOrder traversal: ");
        myTree.postOrderTraversal(myTree.root);

        myTree.deleteNode(myTree.root, 1);
        System.out.println("\nPost-delete: In order traversal:");
        myTree.inOrderTraverseal(myTree.root);

        myTree.deleteNode(myTree.root, 66);
        System.out.println("\nPost-delete: In order traversal:");
        myTree.inOrderTraverseal(myTree.root);

        myTree.deleteNode(myTree.root, 29);
        System.out.println("\nPost-delete: In order traversal:");
        myTree.inOrderTraverseal(myTree.root);

    }
}
