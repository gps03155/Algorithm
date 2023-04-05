class Solution {
    public static int getRank(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int max = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                max++;
                continue;
            }
            for (int num : win_nums) {
                if (lotto == num) {
                    count++;
                    break;
                }
            }
        }

        int[] answer = {getRank(count + max), getRank(count)};
        return answer;
    }
}