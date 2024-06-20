public class FactorialUsingRecursion {

    static long Factorial(long n){
        if(n == 0)
            return 1;
        
        else
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {

        long fact, num=5;

        fact = Factorial(num);

        System.out.println("Factorial of "+num+" = "+fact);
    }
}
