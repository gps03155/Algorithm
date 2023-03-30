class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;

        while (n >= a) {
            n -= a;
            sum += b;
            n += b;
        }

        return sum;
    }
}