import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static double[][] rotate(double[][] board) {
        double[][] rotate = new double[2][2];
        rotate[0][0] = board[1][0];
        rotate[0][1] = board[0][0];
        rotate[1][1] = board[0][1];
        rotate[1][0] = board[1][1];

        return rotate;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[][] board = new double[2][2];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            board[i][0] = Double.parseDouble(st.nextToken());
            board[i][1] = Double.parseDouble(st.nextToken());
        }

        double max = (board[0][0] / board[1][0]) + (board[0][1] / board[1][1]);
        int count = 0;

        for (int i = 0; i < 3; i++) {
            board = rotate(board);
            double num = (board[0][0] / board[1][0]) + (board[0][1] / board[1][1]);

            if (num > max) {
                max = num;
                count = i + 1;
            }
        }
        System.out.println(count);
    }
}