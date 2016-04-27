import java.util.Scanner;

/**
 * Created by X on 27/04/2016.
 * Reverse the whole string, then reverse the sentence
 */

public class ReverseString {
    // "hello world" -> "dlrow olleh"
    public static String reverse1(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;

        while (start < end) {
            char temp = c[start];
            c[start ++] = c[end];
            c[end --] = temp;
        }

        return(String.valueOf(c));
    }

    // "Hello there everyone" -> "everyone there Hello"
    public static String reverse2(String s) {
        char[] chars = reverse1(s).toCharArray();
        String result = "";

        for(int i = 0; i < chars.length; i ++) {
            int offset = i;
            while(i < chars.length && chars[i] != ' ')
                i ++;
            result += reverse1(String.copyValueOf(chars, offset, i - offset) + ' ');
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Please input the string to reverse: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println("Reverse whole string: " + reverse1(s));
        System.out.println("Reverse sentence: " + reverse2(s));
    }
}
