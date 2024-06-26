package Recursion;

public class DecOrder {
    public static void order(int  n){
        
        System.out.println(n);
        if(n == 1){ //base case
            return;
        }
        order(n-1); //recursive case
        
    }

    public static void main(String[] args) {
        order(10);
    }
}
