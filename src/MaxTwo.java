import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by X on 28/04/2016.
 * find the maximum two numbers in a list
 */
public class MaxTwo {
    private static int[] maxTwo(List<Integer> l) {
        if(l.size() < 2) {
            return null;
        }

        int max1 = l.get(0);
        int max2 = l.get(1);
        for (int i = 1; i < l.size(); i++) {
            if(l.get(i) > max1) {
                max2 = max1;
                max1 = l.get(i);
            } else if(l.get(i) > max2) {
                max2 = l.get(i);
            }
        }

        return new int[]{max1, max2};
    }
    public static void main(String[] args) {
        System.out.print("Please input the size of list: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.print("Please input the elements of list: ");
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(Arrays.toString(maxTwo(list)));
    }
}
