import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < t; i++) {
            stack.push(sc.nextInt());
        }

        int count = 1, max = stack.pop();
        while (!stack.isEmpty()) {
            int top = stack.peek();
            if (top > max) {
                count++;
                max = top;
            }
            stack.pop();
        }

        System.out.println(count);
    }
}