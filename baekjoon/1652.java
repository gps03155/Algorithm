import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[][] board = new String[n+1][n+1];
		
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split("");
			
			for(int j=0; j<n; j++) {
				board[i][j] = input[j];
			}
		}
		
		int rowCount = 0;
		
		for(int i=0; i<n; i++) {
			int space = 1;
			for(int j=0; j<n-1; j++) {
				if(board[i][j].equals(".") && board[i][j+1].equals(".")) {
					space++;
				}
				else {
					if(space > 1) {
						rowCount++;
					}
					
					space = 1;
				}
			}

			
			if(space > 1) {
				rowCount++;
			}
		}
		
		int colCount = 0;
		
		for(int i=0; i<n; i++) {
			int space = 1;
			for(int j=0; j<n-1; j++) {
				if(board[j][i].equals(".") && board[j+1][i].equals(".")) {
					space++;
				}
				else {
					if(space > 1) {
						colCount++;
					}
					
					space = 1;
				}
			}
			
			if(space > 1) {
				colCount++;
			}
		}
		
		System.out.println(rowCount + " " + colCount);
	}
}
