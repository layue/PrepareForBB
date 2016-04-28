import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by X on 28/04/2016.
 * [3 4 3 4 2 1 3 4 2 4] --> [4 4 4 4 3 3 3 2 2 1]
 */
public class SortByOccurrence {
    private static void sortByOccurrence(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        int count = a.length;
        int now = 0;
        while(count > 0) {
            if(map.containsValue(count)) {
                for(int o : map.keySet()) {
                    if(map.get(o) == count) {
                        for(int i =0; i < count; i++) {
                            a[now ++] = o;
                        }
                    }
                }
            }
            count = (count - 1) < (a.length - now) ? (count - 1) : (a.length - now);
        }
    }

    public static void main(String[] args) {
        System.out.print("Size: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[size];

        for(int i = 0; i < size; i ++) {
            a[i] = in.nextInt();
        }

        sortByOccurrence(a);
        System.out.print(Arrays.toString(a));
    }
}
