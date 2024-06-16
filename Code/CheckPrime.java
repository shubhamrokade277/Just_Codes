public class CheckPrime {
    public static void main(String[] args) {
        int m = 0, flag = 0;
        int num = 25; // no to check prime or not
        // if num is divisible by any num larger than half of num,
        // then it would also be divisible by a smaller number already checked within
        // the range
        m = num / 2;

        if (num == 0 || num == 1) {
            System.out.println(num + " is NOT a prime num");
        } else {
            // start from 2 coz its smallest prime num
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is NOT a prime num");
                    flag++;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(num + " is a prime num");
            }
        }
    }
}
