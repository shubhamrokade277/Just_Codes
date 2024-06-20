//0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//153 = (1*3) + (5*3) + (3*3)

public class CheckArmstrong {
    public static void main(String[] args) {
        int num = 370;

        int temp, digit = 0, last = 0, sum = 0;

        temp = num;
        // Couting total digits:
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }

        temp = num;
        // actual logic:
        while (temp > 0) {
            last = temp % 10;

            sum += (Math.pow(last, digit));

            temp = temp / 10;
        }
       

        if (num == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
