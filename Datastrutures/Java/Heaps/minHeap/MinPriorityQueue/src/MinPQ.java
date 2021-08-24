public class MinPQ {
    Node head;

    MinPQ(){
        head = null;
    }

    public Node push(Node head, int data, int priority){

        if (head == null)
            head = new Node(data, priority);
        else if(priority < head.priority){
            // create a new node
            Node temp = new Node(data, priority);
            // this wont work need to whiteboard out
            temp.next = head;
            // now insert the new node as "heads"s next
            return temp;
        }
        else {
            // how can we do this recursivley???
            head.next = push(head.next, data, priority);
        }

        return head;
    }

    public boolean isEmpty(Node head){
        boolean empty = false;

        // if head is the null ptr then
        // the queue is empty
        if (head == null)
            empty = true;

        return empty;
    }

    public Node pop(Node head){
        // move the head ptr to the next node
        // to remove the highest priority item
        head = head.next;

        // return the new list
        return head;
    }

    public void peek(Node head){

        // just return whats at the
        // top of the queue; which should be the
        // highest priority item

        if (head == null)
            System.out.println();;

        System.out.println(head.data);
    }
}
