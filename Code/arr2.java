//import java.util.Scanner;

class arr2{
    public static void main(String args[]){
        int arr[] = new int[3];

        System.out.println(arr.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}