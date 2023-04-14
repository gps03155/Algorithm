import java.util.*;

class Solution {
    public String solution(String s) {
         StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            s = s.replaceFirst("\\b" + str + "\\b", str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        }
        
        return s;
    }
}