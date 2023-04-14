import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char cha : s.toCharArray()) {
            switch (cha) {
                case '(':
                    stack.push(cha);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false; 
                    }
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
}