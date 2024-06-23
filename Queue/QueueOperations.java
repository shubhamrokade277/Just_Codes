package Queue;

import java.lang.*;
import java.util.*;
public class QueueOperations {
    public static void main(String[] args) {
        GenericQueue<String> queue = new ArrayQueue<>(5);

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println(queue.dequeue()); // Output: A
        System.out.println(queue.dequeue()); // Output: B

        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");

        try {
            queue.enqueue("G"); // This should throw QueueOverflowException
        } catch (QueueOverflowException e) {
            System.out.println(e.getMessage());
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        try {
            queue.dequeue(); // This should throw QueueUnderflowException
        } catch (QueueUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
