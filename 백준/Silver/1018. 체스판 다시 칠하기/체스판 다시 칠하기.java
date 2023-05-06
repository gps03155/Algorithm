import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static String getChess(String str) {
        return "B".equals(str) ? "W" : "B";
    }

    public static String[][] deepCopy(String[][] arr) {
        String[][] copyArr = new String[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copyArr[i][j] = arr[i][j];
            }
        }

        return copyArr;
    }

    public static int diffCount(int start, int end, int limit, String[][] arr, String[][] copyArr) {
        int count = 0;
        for (int i = start; i < start + limit; i++) {
            for (int j = end; j < end + limit; j++) {
                if (!arr[i][j].equals(copyArr[i][j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String input = "";
        String[][] board = new String[row + 1][col + 1];
        int index = 0;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] inputs = input.split("");

            for (int j = 0; j < inputs.length; j++) {
                board[index][j] = inputs[j];
            }
            index++;
        }

        int answer = Integer.MAX_VALUE;
        for (int k = 0; k < 2; k++) {
            int min = Integer.MAX_VALUE, start = 0, end = 0;
            String startStr = k == 0 ? "B" : "W";

            while (row - start >= 8 && col - end >= 8) {
                String[][] cloneBoard = deepCopy(board);
                cloneBoard[start][end] = startStr;

                for (int i = start; i < start + 8; i++) {
                    for (int j = end; j < end + 8; j++) {
                        // 상
                        if (i > 0 && cloneBoard[i - 1][j].equals(cloneBoard[i][j])) {
                            cloneBoard[i - 1][j] = getChess(cloneBoard[i - 1][j]);
                        }
                        // 하
                        if (cloneBoard[i][j].equals(cloneBoard[i + 1][j])) {
                            cloneBoard[i + 1][j] = getChess(cloneBoard[i + 1][j]);
                        }
                        // 좌
                        if (j > 0 && cloneBoard[i][j - 1].equals(cloneBoard[i][j])) {
                            cloneBoard[i][j - 1] = getChess(cloneBoard[i][j - 1]);
                        }
                        // 우
                        if (cloneBoard[i][j].equals(cloneBoard[i][j + 1])) {
                            cloneBoard[i][j + 1] = getChess(cloneBoard[i][j + 1]);
                        }
                    }
                }

                int count = diffCount(start, end, 8, board, cloneBoard);

                if (count < min) {
                    min = count;
                }

                end++;

                if (col - end < 8) {
                    start++;
                    end = 0;
                }

                if (row - start < 8) {
                    break;
                }
            }
            answer = Math.min(min, answer);
        }

        System.out.println(answer);
    }
}