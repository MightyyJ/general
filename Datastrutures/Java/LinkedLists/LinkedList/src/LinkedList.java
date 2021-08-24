public class LinkedList {
    Node head;

    LinkedList(){
        head = null;
    }

    public Node insertNodeAtEnd(Node head, int data){

        Node skyWalker = head;
        // If head is null then return a new Node
        if (head == null)
            head = new Node(data);
        else{

            // go to the end of the list
            while(skyWalker.next != null)
                skyWalker = skyWalker.next;

            // Insert at the end of the list
            skyWalker.next = new Node(data);
        }

        // return the head Node
        return head;
    }

    public Node insertNodeAtHead(Node head, int data){

        Node temp;
        Node newNode;
        
        // List is empty
        if (head == null)
            head = new Node(data);
        // list is not empty
        else{
            // Make a new Node
            newNode = new Node(data);
            // Hold on to the rest of the list
            temp = head;
            // updated head node
            head = newNode;
            // Link back to the rest of the list 
            newNode.next = temp;
        }
        // return head 
        return head;
    }

    public Node deleteNode(Node head, int data){



        return head;
    }

    public boolean searchNode(Node head, int data){
        boolean hasNode = false;
        Node skyWalker = head;

        while((skyWalker != null) && !hasNode){
            if (skyWalker.data == data)
                hasNode = true;
            else
                skyWalker = skyWalker.next;
        }

        return hasNode;
    }

    public Node updateNode(Node head, int data, int newData){

        return head;
    }

    public Node sortList(Node head){

        return head;
    }

    public void printList(Node head){

        Node skyWalker = head;

        if (head == null)
            System.out.println("Empty List");
        else{
            while(skyWalker != null){
                System.out.print(String.valueOf(skyWalker.data) + "-> ");
                skyWalker = skyWalker.next;
            }
        }

    }
}
