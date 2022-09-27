import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char[][][] board = new char[n][5][7];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				char[] charArr = br.readLine().toCharArray();

				for (int k = 0; k < 7; k++) {
					board[i][j][k] = charArr[k];
				}
			}
		}

		int min = Integer.MAX_VALUE;
		String result = "";

		for (int i = 0; i < n; i++) {			
			for (int l = i+1; l < n; l++) {
				int diff = 0;
				
				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 7; k++) {

						if (board[i][j][k] != board[l][j][k]) {
							diff++;
						}
					}
				}
				
				if (diff < min) {
					min = diff;
					result = String.format("%d %d", Math.min(i + 1, l + 1), Math.max(i + 1, l + 1));
				}
			}
		}

		System.out.println(result);
	}
}
