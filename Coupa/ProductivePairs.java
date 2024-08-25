public class ProductivePairs {

    public static void productivePairs(int n, int[] a, int K) {
        //write code here:

        int count=0;
        //int product=0;
        int sum=0;
        for(int i = 0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                //int product = a[i]*a[j];
                if(a[i]*a[j]>=K){
                    System.out.println(a[i]+" "+a[j]);                   
                    count++;
                    sum += a[i]*a[j];
                }
                
            }
        }
        System.out.println(count+" "+sum);

    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {5, 4, 3, 2, 1};
        int K = 6;
        int n = array.length;
        productivePairs(n, array, K);
    }
}
