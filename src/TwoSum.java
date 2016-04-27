import java.util.*;

/**
 * Created by X on 27/04/2016.
 */
public class TwoSum {
    private static List<int[]> twoSum(int[] array, int target) {
        List<int[]> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            if(map.containsKey(array[i])) {
                int [] temp = new int[2];
                temp[0] = target - array[i];
                temp[1] = array[i];
                result.add(temp);
            } else {
                map.put(target - array[i], i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.print("Please the sum N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print("Please the size of array: ");
        int size = in.nextInt();
        int [] a = new int[size];
        System.out.print("Please the array: ");
        for(int i = 0; i < size; i ++) {
            a[i] = in.nextInt();
        }

        List<int[]> res = new ArrayList<>();

        res = twoSum(a, n);
        for(int i = 0; i < res.size(); i ++) {
            System.out.println(Arrays.toString(res.get(i)));
        }
    }
}
