import java.util.ArrayList;
import java.util.List;

public class ArraySearch {
    // Function to find and collect elements greater than or equal to the key
    public static List<Integer> findGreaterOrEqualElements(int[] array, int key) {
        List<Integer> elements = new ArrayList<>();
        int start = 0;
        int end = array.length - 1; 
        // Binary search to find the starting index
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // start is now the index of the first element >= key
        for (int i = start; i < array.length; i++) {
            elements.add(array[i]);
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int key = 8;
        List<Integer> result = findGreaterOrEqualElements(sortedArray, key);
        System.out.println("Elements greater than or equal to " + key + ": " + result);
    }
}
