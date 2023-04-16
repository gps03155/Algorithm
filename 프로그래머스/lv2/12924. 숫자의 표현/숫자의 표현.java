class Solution {
    public int solution(int n) {
        int start = 1, end = 1, sum = 0;
        int count = 0;

        while (start <= n) {
            if (sum >= n) {
                sum -= start;
                start++;
            } else {
                sum += end;
                end++;
            }

            if (sum == n) {
                count++;
            }
        }

        return count;
    }
}