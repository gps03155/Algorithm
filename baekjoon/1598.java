import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
    
    // code1.
		int num1 = Integer.parseInt(st.nextToken()) - 1;
		int num2 = Integer.parseInt(st.nextToken()) - 1;

		int x = Math.abs(num1 / 4 - num2 / 4);
		int y = Math.abs(num1 % 4 - num2 % 4);

		System.out.println(x + y);
    
    // code2.
    int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		int numRow1 = 0, numCol1 = 0;
		int numRow2 = 0, numCol2 = 0;
		
		int[][] board = new int[4][10000001];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < Math.max(num1, num2); j++) {
				if(j == 0) board[i][j] = i + 1;
				else board[i][j] = board[i][j - 1] + 4;
				
				if(board[i][j] == num1) {
					numRow1 = i;
					numCol1 = j;
				}
				
				if(board[i][j] == num2) {
					numRow2 = i;
					numCol2 = j;
				}
			}
		}
		
		System.out.println(Math.abs(numRow2 - numRow1) + Math.abs(numCol2 - numCol1));
	}
}
