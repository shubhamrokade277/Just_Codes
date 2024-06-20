public class FactorialUsingLoop {
    public static void main(String[] args) {
        int num = 5;
        int fact=1; //start from 1 to avoid multiply by 0 

        //start from 1 to avoid multiply by 0 
        for(int i=1 ; i<=num ; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
