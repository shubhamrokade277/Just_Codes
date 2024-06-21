package Array;

public class ArrayCRUD {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        display(arr);

        arr = addAtEnd(arr, 60);
        display(arr);

        arr = addAtPosition(arr, 99, 2);
        display(arr);

        arr = deleteElement(arr, 20);
        display(arr);

        System.out.println("Right shift:");
        arr = rightShift(arr, 1);
        display(arr);

        System.out.println("left shift:");
        arr = leftShift(arr, 1);
        display(arr);
    }

    static void display(int arr[]){
        for(int i : arr){
            System.out.print(i+"  ");
        }
        System.out.println("");
    }

    static int[] addAtEnd(int arr[], int element){
        int newArr[] = new int[arr.length + 1];
        copyElements(arr, newArr);
        newArr[newArr.length - 1] = element;

        return newArr;
    }

    static int[] addAtPosition(int arr[], int element, int index){
        int newArr[] = new int[arr.length + 1];
        copyElements(arr, newArr);

        int i = newArr.length-1;
        while(i >= index){
            newArr[i] = newArr[--i];
        }
        newArr[i] = element;

        return newArr;

    }

    static void copyElements(int source[], int destinaton[]){
        for(int i=0 ; i<source.length ; i++){
            destinaton[i] = source[i];
        }
    }

    static int[] deleteElement(int arr[], int element){
        int newArr[] = new int[arr.length - 1];
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[newIndex++] = arr[i];
            }
        }

        return newArr;
    }

    static int[] rightShift(int arr[], int times){
        for(int j=0 ; j<times ; j++){
            int lastElement = arr[arr.length-1];  //storing the last element
            int i = arr.length-1;  //storing last index

            while(i>0){
                arr[i] = arr[--i];
            }
            arr[i] = lastElement;  //after completing a rotation add the remianing last index
        }

        return arr;
    }

    static int[] leftShift(int arr[], int times){
        for(int j=0 ; j<times ; j++){
            int firstElement = arr[0]; //storing the first element
            int i = 0;  //storing first index

            while(i<(arr.length-1)){
                arr[i] = arr[++i];
            }
            arr[i] = firstElement;  //after completing a rotation add the remianing first index
        }

        return arr;
    }
}