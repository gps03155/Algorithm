import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char cha : input.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(cha);
                    continue;
                }

                char top = stack.peek();

                if (top == cha) {
                    stack.pop();
                } else {
                    stack.push(cha);
                }
            }

            if (stack.isEmpty()) cnt++;
        }

        System.out.println(cnt);
    }
}