import java.util.*;

public class digitsOfNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int digit = 0;
        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        // System.out.println(digit);

        int div = (int) Math.pow(10, digit - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }

        scn.close();
    }
}