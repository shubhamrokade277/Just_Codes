public class BinarySearch {
    public static int BinarySearch(int num[], int key){
        int start=0, end = num.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) { // right
                start = mid + 1; // increment start to mid + 1
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 7;

        int index = BinarySearch(num, key);
        if (index >= 0) {
            System.out.println("Key found at index:" + index);
        } else {
            System.out.println("Key Not Found!");
        }
    }
}
