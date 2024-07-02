import java.util.*;

public class LinearSearch {
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 7;

        int index = linearSearch(num, key);
        if (index >= 0) {
            System.out.println("Key found at index:" + index);
        } else {
            System.out.println("Key Not Found!");
        }
    }
}
