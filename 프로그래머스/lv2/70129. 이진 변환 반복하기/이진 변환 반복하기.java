class Solution {
    public int[] solution(String s) {
        int count = 0, zeroCount = 0;
        while (!"1".equals(s)) {
            count++;
            zeroCount += s.length() - s.replace("0", "").length();
            s = Integer.toBinaryString(s.replace("0", "").length());
        }

        return new int[]{count, zeroCount};
    }
}