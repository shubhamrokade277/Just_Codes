public class Sorting {

    public static void bubbleSort(int arr[]){
        for(int turn=0 ; turn<arr.length-1 ; turn++){
            for(int i=0 ; i<(arr.length-1)-turn ; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int turn=0 ; turn<arr.length-1 ; turn++){
            int minPos = turn;
            for(int j = turn+1 ; j<arr.length ; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;

        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr= arr[i];
            int prev = i-1;

            //finding out the correct pos to insert
            //while(prev>=0 && arr[prev]<curr){ //for decending
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};

        printArr(arr);
        //bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}