public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Implementing a Min Queue using a LL under the hood!");
        MinPQ pq = new MinPQ();

        pq.isEmpty(pq.head);

        pq.head = pq.push(pq.head, 1, 1);
        pq.head = pq.push(pq.head, 2, 7);
        pq.head = pq.push(pq.head, 3, 6);
        pq.head = pq.push(pq.head, 4, 5);
        pq.head = pq.push(pq.head, 5, 4);
        pq.head = pq.push(pq.head, 6, 3);
        pq.head = pq.push(pq.head, 7, 2);

        pq.peek(pq.head);
        pq.head = pq.pop(pq.head);
        
        pq.peek(pq.head);
    }
}
