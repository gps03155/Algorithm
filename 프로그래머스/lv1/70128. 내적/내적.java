class Solution {
    public int solution(int[] a, int[] b) {
        int size = Math.min(a.length, b.length);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }
}