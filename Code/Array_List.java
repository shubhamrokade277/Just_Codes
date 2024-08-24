import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements by index
        System.out.println(fruits.get(0));  // Output: Apple

        // Remove an element
        fruits.remove("Banana");

        // Check size of the ArrayList
        System.out.println(fruits.size());  // Output: 2

        // Iterate over the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
