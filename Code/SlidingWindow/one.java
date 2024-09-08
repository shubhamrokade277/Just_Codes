// Find max sum from 4 consicutive elements in array

package SlidingWindow;

public class one {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5,6,-1,2};
        int k=4;

        int l=0;
        int r=k-1;
        int sum=0;

        for(int i=l ; i<r ; i++){
            sum=sum+arr[i];
            while(r<arr.length-1){
                sum = sum-arr[l];
                l++;
                sum = sum + arr[n]
            }
            maxsum = max(maxsum,sum)
        }
    }
    
}
