import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by X on 28/04/2016.
 * Given two sentences, find the missing words,
 */
public class MissingWords {
    private static List<String> findMissingString(String mainStr, String subStr) {
        List<String> res = new ArrayList<>();
        if(mainStr.isEmpty()) {
            return res;
        } else if(subStr.isEmpty()) {
            return Arrays.asList(mainStr.split(" "));
        }
        String[] main = mainStr.split(" ");
        String[] sub = subStr.split(" ");

        int i = 0;
        int j = 0;
        while (i < sub.length) {
            if(main[j].equals(sub[i])) {
                i ++;
                j ++;
            } else {
                res.add(main[j]);
                j ++;
            }
        }

        while(j < main.length) {
            res.add(main[j ++]);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("String 1: ");
        String str1 = in.nextLine();
        System.out.print("String 2: ");
        String str2 = in.nextLine();

        System.out.println(Arrays.toString(findMissingString(str1, str2).toArray()));
    }
}
