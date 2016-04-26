import java.util.Scanner;

/*Given an integer n, return the number of ways it can be represented as a sum of 1s and 2s, order matters*/
//recursive
public class NTo1s2s {
    public static int nTo1s2s(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return nTo1s2s(n - 1) + nTo1s2s(n - 2);
    }
//iterative
    public static int nTo1s2sIte(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        int[] a = new int[n];

        a[0] = 1;
        a[1] = 2;
        for(int i = 2; i < n; i ++) {
            a[i] = a[i -1] + a[i - 2];
        }
        return a[n - 1];
    }
    public static void main(String[] args) {
        System.out.print("Please input integer n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(nTo1s2s(n));
        System.out.println(nTo1s2sIte(n));
    }
}
