class Solution {
    public int solution(int n) {
        long oneCount = Integer.bitCount(n);

        while (true) {
            n++;
            
            if (oneCount == Integer.bitCount(n)) {
                return n;
            }
        }
    }
}