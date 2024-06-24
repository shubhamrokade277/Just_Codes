public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = Linking
        newNode.next = head;

        // step3 = make newNode head
        head = newNode;
    }

    public void addLast(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 = Linking
        tail.next = newNode;

        // step3 - make new node as tail:
        tail = newNode;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addAtIndex(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < (idx - 1)) { // increment till temp = prev node & ready for insertion
            temp = temp.next;
            i++;
        }
        // Storing temp.next in newNode.next
        newNode.next = temp.next;
        // addign newNode in temp.next
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int linearIterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp!=null){
            if(temp.data == key){ //If key found at index
                return i;
            }
            temp = temp.next;
            i++;
        }
        //If key NOT found
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int index = helper(head.next, key); //passing next node as head to continue searching
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head; //reversering the full LL so assign tail at head
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; //reverse step
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.traverse();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(40);
        ll.traverse();

        ll.addAtIndex(2, 99);
        ll.traverse();
        System.err.println("size = " + ll.size);
        System.out.println(ll.removeFirst());
        ll.traverse();

        ll.removeLast();
        ll.traverse();

        System.out.println(ll.linearIterativeSearch(30));
        System.out.println(ll.linearIterativeSearch(33));

        System.out.println(ll.recursiveSearch(30));
        System.out.println(ll.recursiveSearch(33));

        ll.traverse();

        ll.reverse();
        ll.traverse();

        //System.out.println(ll.head.next.next.data);

    }
}
