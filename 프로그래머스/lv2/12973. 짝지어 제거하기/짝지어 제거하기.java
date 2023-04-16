import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (char cha : s.toCharArray()) {
            if (stack.size() > 0 && stack.peek() == cha) {
                stack.pop();
            } else {
                stack.push(cha);
            }
        }
        
        return stack.isEmpty()? 1 : 0;
    }
}