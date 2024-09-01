class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node at the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) return;

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // If the node was found, remove it
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Linked list:");
        list.printList();  // Output: 10 -> 20 -> 30 -> 40 -> null

        list.delete(20);
        System.out.println("After deleting 20:");
        list.printList();  // Output: 10 -> 30 -> 40 -> null
    }
}
