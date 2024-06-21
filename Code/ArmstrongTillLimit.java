//0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//153 = (1*3) + (5*3) + (3*3)

import java.util.Scanner;

public class ArmstrongTillLimit {

    static boolean isArmstrong(int n) {
        int temp, digit = 0, last = 0, sum = 0;

        temp = n;
        // couting total digits:
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }

        temp = n;
        while (temp > 0) {
            // getting last digit
            last = temp % 10;

            // main logic:
           sum += (Math.pow(last, digit));

            //sum =sum+ (Math.pow(last, digit));


            temp = temp / 10;
        }

        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int num;

        System.out.println("Enter limit:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + ", ");
            }
        }
        sc.close();
    }
}
