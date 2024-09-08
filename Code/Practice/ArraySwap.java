package Practice;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int l = 0;
        int r = arr.length - 1;

        while (r > l) {
            int temp = 0;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
