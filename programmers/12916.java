class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // case1
        /*
        String[] array = s.split("");
        
        int pCnt = 0;
        int yCnt = 0;

        for(String str : array) {
          if(str.equalsIgnoreCase("p")) {
            pCnt++;
          }

          if(str.equalsIgnoreCase("y")) {
            yCnt++;
          }
        }

        if(pCnt != yCnt) {
          answer = false;
        }
        */
        
        // case2
        s = s.toLowerCase();
        answer = s.chars().filter(m -> 'p' == m).count() == s.chars().filter(m -> 'y' == m).count();
        
        return answer;
    }
}
