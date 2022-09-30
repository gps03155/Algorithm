import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] board = new int[n + 1][m + 1];

		for (int i = 0; i < n; i++) {
			String[] nums = br.readLine().split(" ");

			for (int j = 0; j < m; j++) {
				board[i + 1][j + 1] = Integer.parseInt(nums[j]);
			}
		}

		int k = Integer.parseInt(br.readLine());

		for (int test = 0; test < k; test++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int row=i; row<=x; row++) {
				for(int col=j; col<=y; col++) {
					sum += board[row][col];
				}
			}
			
			System.out.println(sum);
		}
	}
}
