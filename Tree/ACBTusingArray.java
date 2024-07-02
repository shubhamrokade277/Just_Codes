public class ACBTusingArray {
    private int[] tree;
    private int size;
    private int capacity;

    public ACBTusingArray(int capacity) {
        this.capacity = capacity;
        this.tree = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new RuntimeException("Tree is full");
        }
        tree[size] = value;
        size++;
    }

    public Integer getLeftChild(int index) {
        int leftIndex = 2 * index + 1;
        if (leftIndex < size) {
            return tree[leftIndex];
        }
        return null;
    }

    public Integer getRightChild(int index) {
        int rightIndex = 2 * index + 2;
        if (rightIndex < size) {
            return tree[rightIndex];
        }
        return null;
    }

    public Integer getParent(int index) {
        if (index == 0) {
            return null;
        }
        int parentIndex = (index - 1) / 2;
        return tree[parentIndex];
    }

    public void display() {
        System.out.println("Array-based representation:");
        for (int i = 0; i < size; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ACBTusingArray acbt = new ACBTusingArray(10);
        int[] elements = { 10, 20, 30, 40, 50, 60, 70 };
        for (int elem : elements) {
            acbt.insert(elem);
        }

        acbt.display();

        System.out.println("Parent of node 1: " + acbt.getParent(1));
        System.out.println("Left child of node 1: " + acbt.getLeftChild(1));
        System.out.println("Right child of node 1: " + acbt.getRightChild(1));
    }
}
