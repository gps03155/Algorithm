class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] walls = new boolean[n];

        for (int i = 0; i < walls.length; i++) {
            walls[i] = true;
        }

        for (int i = 0; i < section.length; i++) {
            walls[section[i] - 1] = false;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!walls[i]) {
                count++;
                int start = i;
                int end = Math.min(i + m, walls.length);

                for (int j = start; j < end; j++) {
                    walls[j] = true;
                }
            }
        }

        return count;
    }
}