import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer test = Integer.parseInt(br.readLine());
		int[][] board = new int[15][15];
		
		for(int i=0;i<board.length; i++) {
			for(int j=1; j<board.length; j++) {
				if(i == 0) {
					board[i][j] = j;
				}
				else if(j == 1) {
					board[i][j] = 1;
				}
				else {
					board[i][j] = board[i][j-1] + board[i-1][j];
				}
			}
		}
		
		for(int i=0; i<test; i++) {
			Integer floor = Integer.parseInt(br.readLine());
			Integer home = Integer.parseInt(br.readLine());
			
			System.out.println(board[floor][home]);
		}
	}
}
