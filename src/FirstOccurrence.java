import java.util.Scanner;

/**
 * Created by X on 28/04/2016.
 * Given an array and target,  find the first occurrence of given number, accept repeat number
 */
public class FirstOccurrence {

    public static void main(String[] args) {
        System.out.print("Target: ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.print("Size: ");
        int size = in.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }

        System.out.print(firstOccurrence(a, target));
    }

    private static int firstOccurrence(int[] a, int n) {
        if(a.length < 1) {
            return -1;
        }
        int left = 0;
        int right = a.length - 1;
        int mid;

        while (left < right) {
            mid = left + (right - left) / 2;
            if(a[mid] == n) {
                while (mid >= 0 && a[mid] == n) {
                    mid --;
                }
                return mid + 1;
            } else if (a[mid] > n){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if(a[left] == n) {
            while (left >= 0 && a[left] == n) {
                left --;
            }
            return left + 1;
        } else {
            return -1;
        }
    }
}
