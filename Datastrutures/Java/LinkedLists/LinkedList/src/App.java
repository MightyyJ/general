public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("My SINGLYLINKEDLIST");

        boolean hasNode;
        LinkedList mySinglyLinkedList = new LinkedList();

        // create a list filled with evens
        for (int i = 0; i < 100; i++){
            if ((i % 2) == 0){
                mySinglyLinkedList.head = mySinglyLinkedList.insertNodeAtEnd(mySinglyLinkedList.head, i);
            }
        }

        // Print out so far
        mySinglyLinkedList.printList(mySinglyLinkedList.head);

        // Append Odds to fron of the list
        for (int i = 0; i < 100; i++){
            if (i % 3 == 0)
                mySinglyLinkedList.head = mySinglyLinkedList.insertNodeAtHead(mySinglyLinkedList.head, i);
        }

        System.out.println();
        mySinglyLinkedList.printList(mySinglyLinkedList.head);

        System.out.println("\n\n\n");

        hasNode = mySinglyLinkedList.searchNode(mySinglyLinkedList.head, 2);
        System.out.println(String.valueOf(hasNode));

        hasNode = mySinglyLinkedList.searchNode(mySinglyLinkedList.head, 92);
        System.out.println(hasNode);

        hasNode = mySinglyLinkedList.searchNode(mySinglyLinkedList.head, 3);
        System.out.println(hasNode);

        hasNode = mySinglyLinkedList.searchNode(mySinglyLinkedList.head, 99);
        System.out.println(hasNode);

        hasNode = mySinglyLinkedList.searchNode(mySinglyLinkedList.head, 200);
        System.out.println(hasNode);

    }
}
