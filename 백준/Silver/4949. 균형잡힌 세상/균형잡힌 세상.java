import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while ((input = br.readLine()) != null && !input.equals(".")) {
            Stack<Character> stack = new Stack<>();

            boolean isValid = true;
            for (char cha : input.toCharArray()) {
                try {
                    switch (cha) {
                        case '(':
                        case '[':
                            stack.add(cha);
                            break;
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            }

                            isValid = false;
                            break;
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                                break;
                            }

                            isValid = false;
                            break;
                    }
                } catch (EmptyStackException e) {
                    isValid = false;
                }

                if (!isValid) break;
            }

            System.out.println(isValid && stack.isEmpty() ? "yes" : "no");
        }

    }
}