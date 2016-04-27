import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by X on 27/04/2016.
 * Add to big integers
 */
public class BigIntegerSum {
    private static String bigSum(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        char[] s = new char[n1.length > n2.length ? n1.length + 1 : n2.length + 1];

        int p1 = n1.length - 1;
        int p2 = n2.length - 1;
        int x = 0;
        int count = s.length - 1;

        while(p1 >= 0 && p2 >= 0) {
            int temp = (n1[p1] - '0') + (n2[p2] - '0');
            s[count] = (char) (((temp + x) % 10) + '0');
            x = (temp + x) / 10;

            p1 --;
            p2 --;
            count --;
        }

        if(p1 < 0) {
            while (p2 >= 0) {
                int temp = n2[p2] - '0';
                s[count] = (char) (((temp + x) % 10) + '0');
                x = (temp + x) / 10;

                p2 --;
                count --;
            }
        } else {
            while (p1 >= 0) {
                int temp = n1[p1] - '0';
                s[count] = (char) (((temp + x) % 10) + '0');
                x = (temp + x) / 10;

                p1 --;
                count --;
            }
        }
        if(x != 0) {
            s[count] = (char) (x + '0');
            return String.valueOf(s);
        } else {
            return String.valueOf(s, 1, s.length - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Please input two big integers: ");
        Scanner in = new Scanner(System.in);

        String num1 = in.next();
        String num2 = in.next();

        //Use BigInteger
        BigInteger integer1 = new BigInteger(num1);
        BigInteger integer2 = new BigInteger(num2);
        System.out.println(integer1.add(integer2));

        String sum = bigSum(num1, num2);
        System.out.println(sum);
    }

}
