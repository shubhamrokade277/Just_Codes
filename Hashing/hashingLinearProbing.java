class HashTable {
    private int size;
    private int[] keys;
    private int[] values;
    private boolean[] occupied;

    public HashTable(int size) {
        this.size = size;
        this.keys = new int[size];
        this.values = new int[size];
        this.occupied = new boolean[size];
    }

    private int hashFunction(int key) {
        return Math.abs(key) % size;
    }

    public void insert(int key, int value) {
        int index = hashFunction(key);
        int originalIndex = index;
        while (occupied[index]) {
            if (keys[index] == key) {
                values[index] = value;  // Update existing key with new value
                return;
            }
            index = (index + 1) % size;
            if (index == originalIndex) {
                throw new RuntimeException("Hash table is full");
            }
        }
        keys[index] = key;
        values[index] = value;
        occupied[index] = true;
    }

    public Integer search(int key) {
        int index = hashFunction(key);
        int originalIndex = index;
        while (occupied[index]) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % size;
            if (index == originalIndex) {
                return null;
            }
        }
        return null;
    }

    public void delete(int key) {
        int index = hashFunction(key);
        int originalIndex = index;
        while (occupied[index]) {
            if (keys[index] == key) {
                occupied[index] = false;
                return;
            }
            index = (index + 1) % size;
            if (index == originalIndex) {
                return;
            }
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (occupied[i]) {
                System.out.println("Index " + i + ": [" + keys[i] + ": " + values[i] + "]");
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        // Inserting elements
        hashTable.insert(1, 10);
        hashTable.insert(2, 20);
        hashTable.insert(3, 30);

        // Display hash table
        hashTable.display();

        // Searching elements
        System.out.println("Value for key 2: " + hashTable.search(2));  // Output: 20

        // Deleting an element
        hashTable.delete(2);

        // Display hash table after deletion
        hashTable.display();
    }
}
