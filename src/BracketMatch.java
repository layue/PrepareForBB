import java.util.Scanner;
import java.util.Stack;

/**
 * Created by X on 28/04/2016.
 * Given a list of brackets, valid it.
 */
public class BracketMatch {
    private static boolean bracketMatch(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.print("Brackets: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(bracketMatch(str));
    }

}
