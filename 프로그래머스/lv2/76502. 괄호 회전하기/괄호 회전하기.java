import java.util.*;
class Solution {
    public int solution(String s) {
        Deque<String> deque = new LinkedList<>();

        for (String str : s.split("")) {
            deque.add(str);
        }

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = String.join("", deque);
            Stack<String> stack = new Stack<>();

            for (String cha : str.split("")) {
                try {
                    switch (cha) {
                        case "(":
                        case "{":
                        case "[":
                            stack.add(cha);
                            break;
                        case ")":
                            if ("(".equals(stack.peek())) {
                                stack.pop();
                            }
                            break;
                        case "}":
                            if ("{".equals(stack.peek())) {
                                stack.pop();
                            }
                            break;
                        case "]":
                            if ("[".equals(stack.peek())) {
                                stack.pop();
                            }
                            break;
                    }
                } catch (Exception e) {
                    stack.add(cha);
                    break;
                }
            }

            deque.addLast(deque.pollFirst());

            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}