import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] board = new int[n + 1][n + 1];

		board[0][0] = 1;
		board[1][0] = 1;
		board[1][1] = 1;

		for (int i = 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == i) {
					board[i][j] = 1;
					continue;
				}

				board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + 1 == n && j + 1 == k) {
					System.out.println(board[i][j]);
					break;
				}
			}
		}
	}
}
